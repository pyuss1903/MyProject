package com.example.MyProject.demo.dataBase;

import com.example.MyProject.demo.Interface.DB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "environment", havingValue = "DEV")
public class DevDB implements DB {
    public String getData(){
        return "DEV-data";
    }
}
