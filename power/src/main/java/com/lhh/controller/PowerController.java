package com.lhh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 */
@RestController
public class PowerController {


    @RequestMapping("/getPower.do")
    public Object getPoser(){
        Map<String,Object> map = new HashMap();
        map.put("key","power");
        return map;
    }
    @RequestMapping("/getHystrix.do")
    public Object getHystrix(){
        Map<String,Object> map = new HashMap();
        int i = 10/0;
        map.put("1","走了power");
        return map;
    }
}
