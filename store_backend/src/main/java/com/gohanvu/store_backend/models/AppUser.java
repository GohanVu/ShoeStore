package com.gohanvu.store_backend.models;// AppUser.java
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "appUser")
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appUser_userId")
    private int userId;

    @Column(name = "appUser_userName")
    private String userName;

    @Column(name = "appUser_encrytedPassword")
    private String encryptedPassword;

    @Column(name = "appUser_enabled")
    private boolean enabled;
}