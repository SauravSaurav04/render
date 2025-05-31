package com.example.render.controllers;

import com.example.render.entities.User;
import com.example.render.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getUsers")
    public User getUser() {
        // Fetch a user from the database (for demonstration, fetching the first user)
        return userRepository.findAll().stream().findFirst().orElse(null);
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        // Save the user to the database
        return userRepository.save(user);
    }
}
