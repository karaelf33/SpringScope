package com.example.springscope;

import com.example.springscope.controller.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringScopeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringScopeApplication.class, args);
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "taskbean.xml");
        Task task = (Task) ctx.getBean("taskId");
        Task taskSecondOne = (Task) ctx.getBean("taskId_second");
        System.out.println(task == taskSecondOne);
        System.out.println(task + "::" + taskSecondOne);
    }

}
