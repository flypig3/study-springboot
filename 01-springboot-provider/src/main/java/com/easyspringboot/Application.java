package com.easyspringboot;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfi
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
