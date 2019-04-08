package com.lhh.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 */
@ComponentScan("com")
@Configuration
public class AppConfig {

//
//    @Bean
//    public TomcatServletWebServerFactory tomcat() {
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.setPort(6000);
//        return tomcat;
//    }
}
