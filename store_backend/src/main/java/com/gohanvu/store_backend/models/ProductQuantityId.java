package com.gohanvu.store_backend.models;// ProductQuantityId.java
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Embeddable
@Data
public class ProductQuantityId implements Serializable {
    @Column(name = "productQuantity_productId")
    private int productId;

    @Column(name = "productQuantity_sizeId")
    private int sizeId;
}