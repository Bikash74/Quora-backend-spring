package org.example.quorabackendspring.DTOs;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String password;
}
