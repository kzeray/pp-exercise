package com.example.ppexercise.repository;

import com.example.ppexercise.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository {
    User createUser(User newUser);

    List<User> getAllUsers();

}
