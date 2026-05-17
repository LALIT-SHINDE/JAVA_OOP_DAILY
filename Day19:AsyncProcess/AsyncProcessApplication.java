package com.example.asyncprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncProcessApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsyncProcessApplication.class, args);
    }
}
