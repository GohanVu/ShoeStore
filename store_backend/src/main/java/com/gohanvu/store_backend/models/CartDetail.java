package com.gohanvu.store_backend.models;// CartDetail.java
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cartDetail")
@Data
public class CartDetail {
    @EmbeddedId
    private CartDetailId id;

    @Column(name = "cartDetail_quantity")
    private int quantity;
}