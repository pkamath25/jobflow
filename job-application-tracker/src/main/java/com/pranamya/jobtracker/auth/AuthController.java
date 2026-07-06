package com.pranamya.jobtracker.auth;

import com.pranamya.jobtracker.entity.User;
import com.pranamya.jobtracker.exception.AuthenticationException;
import com.pranamya.jobtracker.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;
    private final UserRepository userRepository;

    public AuthController(
            JwtService jwtService,
            UserRepository userRepository) {

        this.jwtService = jwtService;
        this.userRepository = userRepository;
    }

    @PostMapping("/login")
    public String login(
            @RequestBody LoginRequest request) {

        User user = userRepository
                .findByEmail(request.getEmail())
                .orElseThrow(() ->
                        new AuthenticationException(
                                "User not found"));

        if (!user.getPassword()
                .equals(request.getPassword())) {

            throw new AuthenticationException(
                    "Invalid password");
        }

        return jwtService.generateToken(
                user.getEmail());
    }
}