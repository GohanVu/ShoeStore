package com.gohanvu.store_backend.models;

import com.gohanvu.store_backend.models.enums.OrderStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "orders", schema = "storegohan")
public class Order {
    @Id
    @Column(name = "orders_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orders_customerId")
    private Customer ordersCustomer;

    @Size(max = 50)
    @Column(name = "orders_nameRecipent", length = 50)
    private String ordersNamerecipent;

    @Size(max = 15)
    @Column(name = "orders_phoneRecipent", length = 15)
    private String ordersPhonerecipent;

    @Size(max = 255)
    @Column(name = "orders_addressRecipent")
    private String ordersAddressrecipent;

    @Column(name = "orders_date")
    private Instant ordersDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "orders_status")
    private OrderStatus ordersStatus;

    @Size(max = 255)
    @Column(name = "orders_note")
    private String ordersNote;

    @Column(name = "orders_totalPrice")
    private Float ordersTotalprice;

}