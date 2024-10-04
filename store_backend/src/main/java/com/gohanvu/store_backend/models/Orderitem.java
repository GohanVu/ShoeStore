package com.gohanvu.store_backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orderitems", schema = "storegohan")
public class Orderitem {
    @Id
    @Column(name = "orderItems_id", nullable = false)
    private Integer id;

    @Column(name = "orderItems_quantity")
    private Integer orderitemsQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderItems_productId")
    private Product orderitemsProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderItems_sizeId")
    private Size orderitemsSize;

}