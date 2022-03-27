package com.vuelos.springboot.vuelos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="fligths")
public class Flight implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_flight")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_plane", referencedColumnName = "id_plane")
    private Plane idPlane;

    @ManyToOne()
    @JoinColumn(name = "id_route")
    private Route idRoute;

    @Column(name= "take_off_date")
    private LocalDate takeOffDate;

    @Column(name= "landing_date")
    private LocalDate landingDate;

    @Column(name= "take_off_time")
    private LocalTime takeOffTime;

    @Column(name= "landing_time")
    private LocalTime landingTime;

    @Column(name = "number_of_passenger")
    private int numberOfPassenger;

    @ManyToOne
    @JoinColumn(name = "flight_id_route")
    private Route route;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Plane getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(Plane idPlane) {
        this.idPlane = idPlane;
    }

    public Route getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(Route idRoute) {
        this.idRoute = idRoute;
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

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
