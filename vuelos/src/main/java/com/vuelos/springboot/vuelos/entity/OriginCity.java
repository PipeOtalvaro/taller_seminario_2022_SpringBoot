package com.vuelos.springboot.vuelos.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "origin_cities")
public class OriginCity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_origin_city")
    private Long id;

    @Column(length = 100)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
