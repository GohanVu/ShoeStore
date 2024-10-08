package com.gohanvu.store_backend.models;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Timestamp;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private float productPrice;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_imgCode")
    private int productImgCode;

    @ManyToOne
    @JoinColumn(name = "product_brandId")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "product_categoryId")
    private Category category;

    @Column(name = "product_createdAt")
    private Timestamp productCreatedAt;
}