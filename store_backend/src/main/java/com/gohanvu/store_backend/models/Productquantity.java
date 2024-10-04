package com.gohanvu.store_backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productquantity", schema = "storegohan")
public class Productquantity {
    @EmbeddedId
    private ProductquantityId id;

    @MapsId("productquantityProductid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productQuantity_productId", nullable = false)
    private Product productquantityProduct;

    @MapsId("productquantitySizeid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productQuantity_sizeId", nullable = false)
    private Size productquantitySize;

    @Column(name = "productQuantity_quantity")
    private Integer productquantityQuantity;

}