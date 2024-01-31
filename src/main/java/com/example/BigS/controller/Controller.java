package com.example.BigS.controller;


import com.example.BigS.model.ResponseTransfer;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;
@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/api")
    public ResponseTransfer getString(){
        logger.info("Controller received request");
        return new ResponseTransfer("Hello World");
    }
}
