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
public class ProductquantityId implements java.io.Serializable {
    private static final long serialVersionUID = -5886653318610783357L;
    @NotNull
    @Column(name = "productQuantity_productId", nullable = false)
    private Integer productquantityProductid;

    @NotNull
    @Column(name = "productQuantity_sizeId", nullable = false)
    private Integer productquantitySizeid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductquantityId entity = (ProductquantityId) o;
        return Objects.equals(this.productquantitySizeid, entity.productquantitySizeid) &&
                Objects.equals(this.productquantityProductid, entity.productquantityProductid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productquantitySizeid, productquantityProductid);
    }

}