package com.gohanvu.store_backend.models;// CartDetailId.java
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Embeddable
@Data
public class CartDetailId implements Serializable {
    @Column(name = "cartDetail_cartId")
    private int cartId;

    @Column(name = "cartDetail_productId")
    private int productId;

    @Column(name = "cartDetail_sizeId")
    private int sizeId;
}