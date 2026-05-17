package com.example.asyncprocess.controller;

import com.example.asyncprocess.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/start")
    public String startTask() {

        taskService.processTask();

        return "Task is processing asynchronously...";
    }
}
