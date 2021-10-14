package com.example.springscope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api2/")
public class TaskController {


    @Autowired
    private TaskService taskService;

    @PostMapping("createTaskBean")
    public void createTaskBean() {
        taskService.createTaskBeanService();
    }


    @PostMapping("updateTaskBean")
    public void updateTaskBean() {
        taskService.updateTaskBeanService();
    }


}
