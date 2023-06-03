package com.example.biblioteka.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;


@Entity
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int personID;
    private String firstName;
    private String lastName;
    private String login;
    private String email;
    private String address;
    private String password;
}
