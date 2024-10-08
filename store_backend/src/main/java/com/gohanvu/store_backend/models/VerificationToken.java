package com.gohanvu.store_backend.models;// VerificationToken.java
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "verificationToken")
@Data
public class VerificationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "verificationToken_id")
    private int id;

    @Column(name = "verificationToken_expiryTime")
    private Date expiryTime;

    @Column(name = "verificationToken_token")
    private String token;

    @ManyToOne
    @JoinColumn(name = "verificationToken_userId")
    private AppUser user;
}