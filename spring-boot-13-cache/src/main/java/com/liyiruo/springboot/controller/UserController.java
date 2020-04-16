package com.liyiruo.springboot.controller;

import com.liyiruo.springboot.entites.User;
import com.liyiruo.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        log.info("id=={}",id);
        log.info("userService.getUserById(id)=={}",userService.getUserById(id));
        return userService.getUserById(id);
    }

    @PutMapping("/update")
    public User updateUser(User user) {
        log.info("updateUser.user===>{}",user);
        Integer id=user.getId();
        User u= userService.updateUser(user);
        return u;
    }

    @PostMapping("/addUser")
    public User addUser(User user) {
       Integer i= userService.addUser(user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public Integer deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
        return id;
    }

}
