package com.lhh.service;


import com.lhh.utils.R;
import org.springframework.stereotype.Component;


@Component //一定要加！！！！！！！！！！！
public class PowerfeignFallBack implements PowerFeignClient {

    public Object getPower() {
        return R.error("power服务暂时不可用");
    }

    @Override
    public Object getHystrix() {
        return "error";
    }

    public Object getPowerList() {
        return R.error("getPowerList暂时不可用");
    }
}
