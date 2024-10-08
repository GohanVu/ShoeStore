package com.gohanvu.store_backend.models;// Brand.java
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "brand")
@Data
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private int brandId;

    @Column(name = "brand_name")
    private String brandName;
}