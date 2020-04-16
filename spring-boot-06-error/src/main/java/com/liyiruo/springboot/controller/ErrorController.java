package com.liyiruo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liyiruo
 * @data 2020/3/27  3:48 下午
 */
@Controller
@RequestMapping("/")
public class ErrorController {

    //http://localhost:8080/hello
    @RequestMapping("/hello")
    public String list() {
        int i = 1 / 0;
        return "hello";
    }

    //http://localhost:8080/err
    @RequestMapping("/err")
    public String list2() {
        return "err";
    }

    //http://localhost:8080/hello3
    @RequestMapping("/hello3")
    public String list3() {
        return "hello";
    }

}
