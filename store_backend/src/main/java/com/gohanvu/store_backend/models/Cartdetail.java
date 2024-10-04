package com.gohanvu.store_backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cartdetail", schema = "storegohan")
public class Cartdetail {
    @EmbeddedId
    private CartdetailId id;

    @MapsId("cartdetailCartid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cartDetail_cartId", nullable = false)
    private Cart cartdetailCart;

    @MapsId("cartdetailProductid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cartDetail_productId", nullable = false)
    private Product cartdetailProduct;

    @MapsId("cartdetailSizeid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cartDetail_sizeId", nullable = false)
    private Size cartdetailSize;

    @Column(name = "cartDetail_quantity")
    private Integer cartdetailQuantity;

}