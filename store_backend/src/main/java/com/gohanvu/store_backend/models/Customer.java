package com.gohanvu.store_backend.models;

import com.gohanvu.store_backend.models.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer", schema = "storegohan")
public class Customer {
    @Id
    @Column(name = "customer_id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "customer_name", length = 50)
    private String customerName;

    @Size(max = 100)
    @Column(name = "customer_email", length = 100)
    private String customerEmail;

    @Size(max = 15)
    @Column(name = "customer_phone", length = 15)
    private String customerPhone;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_gender")
    private Gender customerGender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_userId")
    private Appuser customerUser;

}