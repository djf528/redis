package com.example.testspringclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestspringclouddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestspringclouddemoApplication.class, args);
    }

}
