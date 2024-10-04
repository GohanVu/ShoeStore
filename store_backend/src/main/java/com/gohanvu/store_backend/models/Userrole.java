package com.gohanvu.store_backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "userrole", schema = "storegohan")
public class Userrole {
    @Id
    @Column(name = "userRole_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userRole_roleId")
    private Approle userroleRole;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userRole_userId")
    private Appuser userroleUser;

}