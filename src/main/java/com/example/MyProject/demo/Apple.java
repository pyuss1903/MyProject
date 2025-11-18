package com.example.MyProject.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class Apple {

    void eatApple() {
        System.out.println("Apple eating...I am piyush");
    }

    @PostConstruct
    void callThisBeforeAppleisUsed(){
        System.out.println("bean is created");
    }

    @PreDestroy
    void callThisAfterAppleisUsed(){
        System.out.println("bean is destroyed");
    }
}
