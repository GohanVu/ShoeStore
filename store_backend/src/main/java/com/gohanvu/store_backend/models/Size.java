package com.gohanvu.store_backend.models;// Size.java
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "size")
@Data
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id")
    private int sizeId;

    @Column(name = "size_number")
    private int sizeNumber;
}