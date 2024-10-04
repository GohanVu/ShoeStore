package com.gohanvu.store_backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cart", schema = "storegohan")
public class Cart {
    @Id
    @Column(name = "cart_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_customerId")
    private Customer cartCustomer;

}