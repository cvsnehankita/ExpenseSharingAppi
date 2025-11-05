package com.expense.api.controller;

import com.expense.api.entity.Users;
import com.expense.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class UsersController {
    @Autowired
    private UserService userService;
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @PostMapping ("/adduser")
    public Users addUser(@RequestBody Users user) {
        user.setCreated(LocalDateTime.now());
        return userService.addUser(user);
    }
}
