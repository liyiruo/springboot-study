package com.liyiruo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class SpringBoot11AsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot11AsyncApplication.class, args);
    }

}
