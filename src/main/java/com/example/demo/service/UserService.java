package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public User getByUserNameAndPassword(User user) {
        return userMapper.getByUserNameAndPassword(user);
    }

}
