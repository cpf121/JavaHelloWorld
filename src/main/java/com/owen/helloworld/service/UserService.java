package com.owen.helloworld.service;

import com.owen.helloworld.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> list();
}
