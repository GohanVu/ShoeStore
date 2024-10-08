package com.gohanvu.store_backend.models;// ProductImages.java
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "productImages")
@Data
public class ProductImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productImage_id")
    private int productImageId;

    @ManyToOne
    @JoinColumn(name = "productImage_productId")
    private Product product;

    @Column(name = "productImage_url")
    private String productImageUrl;
}