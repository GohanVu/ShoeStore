package com.gohanvu.store_backend.models;// Customer.java
import com.gohanvu.store_backend.models.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_email")
    private String customerEmail;

    @Column(name = "customer_phone")
    private String customerPhone;

    @Column(name = "customer_gender")
    @Enumerated(EnumType.STRING)
    private Gender customerGender;

    @ManyToOne
    @JoinColumn(name = "customer_userId")
    private AppUser user;
}