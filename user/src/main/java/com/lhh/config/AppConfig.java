package com.lhh.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@ComponentScan("com")
@Configuration
public class AppConfig {

    @Bean
    @LoadBalanced  //客户端负载均衡 ribbon
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

//    /**
//     * 定义客户端 负载均衡 随机策略
//     * @return
//     */
//    @Bean
//    public IRule rule(){
//        return new RandomRule();
//    }

//    @Bean
//    public TomcatServletWebServerFactory tomcat(){
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.setPort(5000);
//        return  tomcat;
//    }
}
