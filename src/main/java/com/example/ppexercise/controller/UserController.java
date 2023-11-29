package com.example.ppexercise.controller;

import com.example.ppexercise.model.User;
import com.example.ppexercise.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser) {
        User createdUser = userService.createUser(newUser);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    // Other CRUD operations can be added similarly
}
