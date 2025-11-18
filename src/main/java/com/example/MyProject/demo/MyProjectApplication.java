package com.example.MyProject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyProjectApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyProjectApplication.class, args);
        DBService dbService = context.getBean(DBService.class);
        System.out.println(dbService.getData());
	}

}
