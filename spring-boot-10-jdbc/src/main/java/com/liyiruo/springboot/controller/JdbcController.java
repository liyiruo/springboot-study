package com.liyiruo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class JdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping("/getList")
    @ResponseBody
    public Map<String, Object> list() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from myuser");
        System.out.println(maps);
        return maps.get(0);
    }

}
