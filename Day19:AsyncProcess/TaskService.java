package com.example.asyncprocess.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Async
    public void processTask() {

        try {
            System.out.println("Task Started: " + Thread.currentThread().getName());

            Thread.sleep(5000);

            System.out.println("Task Completed: " + Thread.currentThread().getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
