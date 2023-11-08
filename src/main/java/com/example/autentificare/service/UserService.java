package com.example.autentificare.service;

import com.example.autentificare.model.User;
import com.example.autentificare.repository.UserRepository;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserByUsername(String username) throws Exception {
        return userRepository.findUserByUsername(username).orElseThrow(()->new Exception("username not found"));
    }
}
