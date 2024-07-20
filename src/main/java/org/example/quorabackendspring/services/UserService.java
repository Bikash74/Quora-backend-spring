package org.example.quorabackendspring.services;

import org.example.quorabackendspring.DTOs.UserDTO;
import org.example.quorabackendspring.entites.User;
import org.example.quorabackendspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserDTO userDTO){
        User user = User.builder()
                .id(userDTO.getId())
                .username(userDTO.getUsername())
                .password(userDTO.getPassword())
                .build();
        return userRepository.save(user);
    }
}
