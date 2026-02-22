package com.vt.rbs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table( name = "roles")
public class Role extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String name;
}
