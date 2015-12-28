package com.kan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 容器
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
