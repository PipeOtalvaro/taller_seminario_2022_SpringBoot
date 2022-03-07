package com.vuelos.springboot.vuelos.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="planes")
public class Plane implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_plane")
    private Long idPlane;

    @Column(name = "number_chair", length = 3)
    private int numberChair;

    @Column(length = 10)
    private String code;

    public Long getIdPlane() {
        return idPlane;
    }

    public void setIdPlanes(Long idPlane) {
        this.idPlane = idPlane;
    }

    public int getNumberChair() {
        return numberChair;
    }

    public void setNumberChair(int numberChair) {
        this.numberChair = numberChair;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
