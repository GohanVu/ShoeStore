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
@Table(name = "appuser", schema = "storegohan")
public class Appuser {
    @Id
    @Column(name = "appUser_userId", nullable = false)
    private Integer id;

    @Size(max = 36)
    @Column(name = "appUser_userName", length = 36)
    private String appuserUsername;

    @Size(max = 128)
    @Column(name = "appUser_encrytedPassword", length = 128)
    private String appuserEncrytedpassword;

    @Column(name = "appUser_enabled")
    private Boolean appuserEnabled;

}