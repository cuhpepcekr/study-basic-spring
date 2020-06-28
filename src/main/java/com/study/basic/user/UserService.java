package com.study.basic.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers() {
        List<User> users = userRepository.findAll();

        return users;
    }

    public User createUser(User user) {
        User createdUser = userRepository.save(user);

        return createdUser;
    }
}
