package com.gohanvu.store_backend.models;// Cart.java
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cart")
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private int cartId;

    @ManyToOne
    @JoinColumn(name = "cart_customerId")
    private Customer customer;
}