package com.owen.helloworld.service.impl;

import com.owen.helloworld.dao.UserRepository;
import com.owen.helloworld.entity.User;
import com.owen.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userDao;

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }
    @Override
    public List<User> list() {
        return userDao.findAll();
    }
}
