package com.example.ppexercise.service;

import com.example.ppexercise.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User createUser(User newUser);
}
