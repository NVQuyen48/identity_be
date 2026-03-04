package com.devteria.identityservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String username;
    @Column(nullable = false, length = 255)
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;


}
