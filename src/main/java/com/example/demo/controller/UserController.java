package com.example.demo.controller;

import com.example.demo.entity.Response;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("user/insert")
    public Response insertUser(@RequestBody User user) {
        try {
            int result = userService.insertUser(user);
            return Response.success(result);
        } catch(Exception e) {
            return Response.failure(500, "服务器异常");
        }
    }

    @PostMapping("user/getByUserNameAndPassword")
    public Response getByUserNameAndPassword(@RequestBody User user) {
        try {
            User result = userService.getByUserNameAndPassword(user);
            return Response.success(result);
        } catch(Exception e) {
            return Response.failure(500, "服务器异常");
        }
    }

}
