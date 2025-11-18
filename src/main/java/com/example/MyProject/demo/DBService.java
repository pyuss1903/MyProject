package com.example.MyProject.demo;

import com.example.MyProject.demo.Interface.DB;
import com.example.MyProject.demo.dataBase.DevDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    final private DB db;

    //Constructor dependency (other was the autowired/field injection)
    public DBService(DB db){
        this.db = db;
    }

    String getData() {
        return db.getData();
    }
}
