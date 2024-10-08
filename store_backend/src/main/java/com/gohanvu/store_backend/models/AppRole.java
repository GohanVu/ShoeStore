package com.gohanvu.store_backend.models;// AppRole.java
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "appRole")
@Data
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appRole_roleId")
    private int roleId;

    @Column(name = "appRole_roleName")
    private String roleName;
}