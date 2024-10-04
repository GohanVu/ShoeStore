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
@Table(name = "approle", schema = "storegohan")
public class Approle {
    @Id
    @Column(name = "appRole_roleId", nullable = false)
    private Integer id;

    @Size(max = 30)
    @Column(name = "appRole_roleName", length = 30)
    private String approleRolename;

}