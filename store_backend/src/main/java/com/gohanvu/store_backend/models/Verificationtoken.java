package com.gohanvu.store_backend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "verificationtoken", schema = "storegohan")
public class Verificationtoken {
    @Id
    @Column(name = "verificationToken_id", nullable = false)
    private Integer id;

    @Column(name = "verificationToken_expiryTime")
    private Instant verificationtokenExpirytime;

    @Size(max = 255)
    @Column(name = "verificationToken_token")
    private String verificationtokenToken;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "verificationToken_userId")
    private Appuser verificationtokenUser;

}