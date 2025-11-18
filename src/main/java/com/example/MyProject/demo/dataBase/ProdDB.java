package com.example.MyProject.demo.dataBase;

import com.example.MyProject.demo.Interface.DB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "environment", havingValue = "PROD")
public class ProdDB implements DB {

    public String getData(){
        return "PROD-data";
    }
}
