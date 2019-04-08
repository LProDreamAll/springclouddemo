package com.lhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppEureka3000Config {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka3000Config.class);
    }
}
