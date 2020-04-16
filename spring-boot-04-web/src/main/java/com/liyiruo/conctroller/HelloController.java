package com.liyiruo.conctroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liyiruo
 * @data 2020/3/20  11:06 上午
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/success")
    public String execute() {
        return "hello liyiruo";
    }
}
