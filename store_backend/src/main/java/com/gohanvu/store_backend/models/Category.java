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
@Table(name = "category", schema = "storegohan")
public class Category {
    @Id
    @Column(name = "category_id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "category_name")
    private String categoryName;

}