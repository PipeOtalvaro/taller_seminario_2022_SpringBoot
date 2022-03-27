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

    @Column(name = "passenger_capacity", length = 3)
    private int passengerCapacity;

    @Column(length = 100)
    private String airline;

    @Column(length = 100)
    private String model;

    public Long getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(Long idPlane) {
        this.idPlane = idPlane;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
