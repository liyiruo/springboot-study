package com.liyiruo.springboot.controller;

import com.liyiruo.springboot.server.AsyncServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncServer asyncServer;
    @RequestMapping("/hello")
    public String hello() {
        asyncServer.batchAdd();
        return "hello";
    }
}

