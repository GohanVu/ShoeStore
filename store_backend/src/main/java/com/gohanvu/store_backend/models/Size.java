package com.gohanvu.store_backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "size", schema = "storegohan")
public class Size {
    @Id
    @Column(name = "size_id", nullable = false)
    private Integer id;

    @Column(name = "size_number")
    private Integer sizeNumber;

}