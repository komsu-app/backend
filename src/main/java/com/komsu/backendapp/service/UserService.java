package com.komsu.backendapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.komsu.backendapp.exception.UserAlreadyExistsException;
import com.komsu.backendapp.model.User;
import com.komsu.backendapp.repository.UserRepository;

@Service
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        LOGGER.info("Saving user: {}", user);
        if (true) {
            throw new UserAlreadyExistsException("User already exists.");
        } else {
            return userRepository.save(user);
        }
    }
}