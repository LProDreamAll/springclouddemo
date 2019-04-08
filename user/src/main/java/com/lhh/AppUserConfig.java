package com.lhh;


import config.OrderRuleConfig;
import config.PowerRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClients({
        @RibbonClient(name = "SERVER-ORDER",configuration = OrderRuleConfig.class),
        @RibbonClient(name = "SERVER-POWER",configuration = PowerRuleConfig.class)
})
@EnableHystrix
public class AppUserConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppUserConfig.class);
    }
}
