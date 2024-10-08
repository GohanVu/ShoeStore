package com.gohanvu.store_backend.models;// UserRole.java
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "userRole")
@Data
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userRole_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "userRole_roleId")
    private AppRole role;

    @ManyToOne
    @JoinColumn(name = "userRole_userId")
    private AppUser user;
}