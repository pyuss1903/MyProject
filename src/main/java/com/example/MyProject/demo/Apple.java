package com.example.MyProject.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
public class Apple {

    int a=7;

    void setA(int a)
    {
        this.a=a;
    }

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
