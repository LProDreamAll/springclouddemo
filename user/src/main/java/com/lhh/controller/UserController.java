package com.lhh.controller;

import com.lhh.service.PowerFeignClient;
import com.lhh.utils.R;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    private static final String POWER_URL = "http://SERVER-POWER";

    @Autowired
    private PowerFeignClient powerFeignClient;

    @RequestMapping("/getUser.do")
    public R getUser() {
        Map<String, Object> map = new HashMap();
        map.put("key", "user");
        return R.success("返回成功", map);
    }

    @RequestMapping("/getHystrix.do")
    @HystrixCommand(fallbackMethod = "userError")
    public R getHystrix() {
        return R.success("操作成功", powerFeignClient.getHystrix());
    }


    @RequestMapping("/getFeignPower.do")
    public R getFeignPower() {

        return R.success("操作成功", powerFeignClient.getPower());
    }

    @RequestMapping("/getPower.do")
    @HystrixCommand(threadPoolKey = "power", threadPoolProperties = {@HystrixProperty(name = "coreSize", value = "5")})
    public R getPower() {
        HashMap<String, Object> objectObjectHashMap = new HashMap<String, Object>();
        //http://localhost:5000/getPower.do
//        return R.success("操作成功", restTemplate.getForObject("http://localhost:80/getPower.do", Object.class));
        return R.success("操作成功", restTemplate.getForObject(POWER_URL + "/getPower.do", Object.class));
    }
    public R userError(){
        return R.error("系统正在升级");
    }
}
