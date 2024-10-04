package com.gohanvu.store_backend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "products", schema = "storegohan")
public class Product {
    @Id
    @Column(name = "product_id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Float productPrice;

    @Lob
    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_imgCode")
    private Integer productImgcode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_brandId")
    private Brand productBrand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_categoryId")
    private Category productCategory;

    @Column(name = "product_createdAt")
    private Instant productCreatedat;

}