package com.owen.helloworld.controller;

import com.owen.helloworld.entity.User;
import com.owen.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public User add(User user) {
        userService.addUser(user);
        return user;
    }
    @GetMapping("list")
    public List<User> list() {
        return userService.list();
    }
}
