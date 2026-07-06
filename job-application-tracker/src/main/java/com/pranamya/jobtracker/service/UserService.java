package com.pranamya.jobtracker.service;

import com.pranamya.jobtracker.entity.User;
import com.pranamya.jobtracker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {

        user.setCreatedAt(LocalDateTime.now());

        return userRepository.save(user);
    }
}