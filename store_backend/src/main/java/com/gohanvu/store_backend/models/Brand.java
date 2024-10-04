package com.gohanvu.store_backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "brand", schema = "storegohan")
public class Brand {
    @Id
    @Column(name = "brand_id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "brand_name")
    private String brandName;

}