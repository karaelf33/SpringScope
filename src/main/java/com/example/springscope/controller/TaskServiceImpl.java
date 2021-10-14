package com.example.springscope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    ApplicationContext ctx;

    @Override
    public void createTaskBeanService() {
        ctx = new ClassPathXmlApplicationContext("taskbean.xml");

        Task task = (Task) ctx.getBean("taskId");
        task.setTitle("Spring Scope");
        task.setDescription("create a singleton scope");
        task.setAssign("Yusuf Beştaş");

        System.out.println(ThreadColors.Red + "Create Task");
        System.out.println(ThreadColors.Red + "Task hascode=> " + task.hashCode() +
                " Task title=> " + task.getTitle() +
                " Task Description => " + task.getDescription() + " Assigned who =>" + task.getAssign());
        System.out.println("ctx->>>" + ctx);
        System.out.println("task->>" + task);
        System.out.println("bean id" + ctx.getBean("taskId"));


    }

    @Override
    public void updateTaskBeanService() {
        Task task = (Task) ctx.getBean("taskId");
        task.setTitle("Spring Scope title have change");
        task.setDescription("create a singleton scope also have to use request scope");
        task.setAssign("Yusuf2 Beştaş");

        System.out.println(ThreadColors.Blue + "ctx->>>" + ctx);
        System.out.println("task->>" + task);
        System.out.println("bean id" + ctx.getBean("taskId"));
        System.out.println(ThreadColors.Blue + "Update Task");
        System.out.println(ThreadColors.Blue + "Task hascode=> " + task.hashCode() +
                " Task title=> " + task.getTitle() +
                " Task Description => " + task.getDescription() + " Assigned who =>" + task.getAssign());


    }
}
