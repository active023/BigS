package com.example.BigS.controller;


import com.example.BigS.model.ResponseBody;
import com.example.BigS.model.ResponseTransfer;
import com.example.BigS.service.MyService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    MyService myService;

    @GetMapping("/api")
    public ResponseTransfer getString(){
        logger.info("Controller received request");
        return new ResponseTransfer("Hello World");
    }

    @PostMapping("/")
    public ResponseTransfer add(@RequestBody ResponseBody body){

        myService.add(body);

        return new ResponseTransfer("Posted");

    }
}
