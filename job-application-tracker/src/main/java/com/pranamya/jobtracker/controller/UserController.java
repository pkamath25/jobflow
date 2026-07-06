package com.pranamya.jobtracker.controller;

import com.pranamya.jobtracker.dto.UserRequest;
import com.pranamya.jobtracker.entity.User;
import com.pranamya.jobtracker.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@Valid @RequestBody UserRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        return userService.createUser(user);
    }
}