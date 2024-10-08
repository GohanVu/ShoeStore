package com.gohanvu.store_backend.models;// OrderItems.java
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orderItems")
@Data
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderItems_id")
    private int orderItemsId;

    @Column(name = "orderItems_quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "orderItems_productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "orderItems_sizeId")
    private Size size;
}