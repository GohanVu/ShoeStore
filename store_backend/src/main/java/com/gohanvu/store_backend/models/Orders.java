package com.gohanvu.store_backend.models;// Orders.java
import com.gohanvu.store_backend.models.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private int ordersId;

    @ManyToOne
    @JoinColumn(name = "orders_customerId")
    private Customer customer;

    @Column(name = "orders_nameRecipent")
    private String nameRecipent;

    @Column(name = "orders_phoneRecipent")
    private String phoneRecipent;

    @Column(name = "orders_addressRecipent")
    private String addressRecipent;

    @Column(name = "orders_date")
    private Date date;

    @Column(name = "orders_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(name = "orders_note")
    private String note;

    @Column(name = "orders_totalPrice")
    private float totalPrice;
}