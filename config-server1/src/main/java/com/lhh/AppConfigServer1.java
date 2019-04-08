package com.lhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 需要咨询java高级课程的同学可以加安其拉老师的QQ：3164703201
 * author：鲁班学院-商鞅老师
 */

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class AppConfigServer1 {

    public static void main(String[] args) {
        SpringApplication.run(AppConfigServer1.class);
    }
}