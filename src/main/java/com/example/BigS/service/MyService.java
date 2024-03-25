package com.example.BigS.service;

import com.example.BigS.controller.Controller;
import com.example.BigS.entity.MyTable;
import com.example.BigS.model.ResponseBody;
import com.example.BigS.repository.MyTableRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;


@Service
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    @Autowired
    private MyTableRepository myTableRepository;


    public void add(ResponseBody body){

        MyTable myTable = new MyTable();

        myTable.setName(body.name());
        myTable.setDescription(body.description());

        myTable.setCreatedAt(new Timestamp(new Date().getTime()));
        myTableRepository.save(myTable);

        logger.info("Added record in the table");
    }
}
