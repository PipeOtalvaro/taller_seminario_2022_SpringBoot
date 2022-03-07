package com.vuelos.springboot.vuelos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Table
public class Flights implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_flight")
    private Long id;

    @Column(name = "id_plane")
    private Long idPlane;

    @Column(name= "take_off_date")
    private LocalDate takeOffDate;

    @Column(name= "landing_date")
    private LocalDate landingDate;

    @Column(name= "take_off_time")
    private LocalTime takeOffTime;

    @Column(name= "landing_time")
    private LocalTime landingTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(Long idPlane) {
        this.idPlane = idPlane;
    }

    public LocalDate getTakeOffDate() {
        return takeOffDate;
    }

    public void setTakeOffDate(LocalDate takeOffDate) {
        this.takeOffDate = takeOffDate;
    }

    public LocalDate getLandingDate() {
        return landingDate;
    }

    public void setLandingDate(LocalDate landingDate) {
        this.landingDate = landingDate;
    }

    public LocalTime getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(LocalTime takeOffTime) {
        this.takeOffTime = takeOffTime;
    }

    public LocalTime getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(LocalTime landingTime) {
        this.landingTime = landingTime;
    }
}
