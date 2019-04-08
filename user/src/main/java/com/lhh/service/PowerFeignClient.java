package com.lhh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 */

@FeignClient(name = "SERVER-POWER",fallback =PowerfeignFallBack.class )
public interface PowerFeignClient {

    @RequestMapping("/getPower.do")
    public Object getPower();

    @RequestMapping("/getHystrix.do")
    public Object getHystrix();
}
