package com.example.MyProject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyProjectApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyProjectApplication.class, args);
        Apple test1 = context.getBean(Apple.class);
        Apple test2 = context.getBean(Apple.class);
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
	}

}
