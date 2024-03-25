package com.example.BigS.controller;

import com.example.BigS.model.ResponseBody;
import com.example.BigS.service.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.assertArg;
import static org.mockito.Mockito.doNothing;

@SpringBootTest
public class ControllerTests {

    @Autowired
    Controller controller;
    @Mock
    MyService myService;

//    @Test
//    void add() {
//
//        ArgumentCaptor<ResponseBody> responseBodyArgumentCaptor = ArgumentCaptor.forClass(ResponseBody.class);
//
//        doNothing().when(myService).add(responseBodyArgumentCaptor.capture());
//        ResponseBody body = new ResponseBody("Hello", "World");
//        controller.add(body);
//
//        assertEquals(responseBodyArgumentCaptor.getValue().name(), "Hello");
//
//
//    }
}
