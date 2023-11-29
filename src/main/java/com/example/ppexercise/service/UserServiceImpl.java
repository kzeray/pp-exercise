package com.example.ppexercise.service;

import com.example.ppexercise.model.User;
import com.example.ppexercise.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User createUser(User newUser) {
        return userRepository.createUser(newUser);
    }
}
