package com.liyiruo.springboot.controller;

import com.liyiruo.springboot.server.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduledController {

    @Autowired
    ScheduledService scheduledService;
    @RequestMapping("/scheul")
    public String scheul() {
        scheduledService.count();
        return "success";
    }
}
