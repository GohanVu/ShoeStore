package com.gohanvu.store_backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CartdetailId implements java.io.Serializable {
    private static final long serialVersionUID = 5922455702780742926L;
    @NotNull
    @Column(name = "cartDetail_cartId", nullable = false)
    private Integer cartdetailCartid;

    @NotNull
    @Column(name = "cartDetail_productId", nullable = false)
    private Integer cartdetailProductid;

    @NotNull
    @Column(name = "cartDetail_sizeId", nullable = false)
    private Integer cartdetailSizeid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CartdetailId entity = (CartdetailId) o;
        return Objects.equals(this.cartdetailCartid, entity.cartdetailCartid) &&
                Objects.equals(this.cartdetailProductid, entity.cartdetailProductid) &&
                Objects.equals(this.cartdetailSizeid, entity.cartdetailSizeid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartdetailCartid, cartdetailProductid, cartdetailSizeid);
    }

}