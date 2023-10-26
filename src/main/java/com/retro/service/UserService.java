package com.retro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retro.model.User;
import com.retro.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
       User added_user = userRepository.save(user);
        return added_user;
    }

    public Optional<User> getUserByUserId(int userId) {
        return userRepository.findById(userId);

    }

}
