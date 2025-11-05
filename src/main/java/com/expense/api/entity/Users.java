package com.expense.api.entity;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Users {
    private Integer userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private LocalDateTime created;
}
