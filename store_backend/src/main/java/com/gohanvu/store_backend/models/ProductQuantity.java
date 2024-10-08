package com.gohanvu.store_backend.models;// ProductQuantity.java
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "productQuantity")
@Data
public class ProductQuantity {
    @EmbeddedId
    private ProductQuantityId id;

    @Column(name = "productQuantity_quantity")
    private int quantity;
}