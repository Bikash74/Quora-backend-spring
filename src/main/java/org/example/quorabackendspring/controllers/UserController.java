package org.example.quorabackendspring.controllers;

import org.example.quorabackendspring.DTOs.UserDTO;
import org.example.quorabackendspring.entites.User;
import org.example.quorabackendspring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
}
