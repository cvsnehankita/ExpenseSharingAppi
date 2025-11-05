package com.expense.api.service;

import com.expense.api.entity.Users;
import com.expense.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users addUser(Users user) {
      return userRepository.save(user);
    }
}
