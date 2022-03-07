package com.vuelos.springboot.vuelos.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table
public class Route implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_route")
    private Long id;

    @Column(name = "id_flight")
    private Long idFlight;

    @Column(name = "id_origin_city")
    private Long idOriginCity;

    @Column(name = "id_destination_city")
    private Long idDestinationCity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(Long idFlight) {
        this.idFlight = idFlight;
    }

    public Long getIdOriginCity() {
        return idOriginCity;
    }

    public void setIdOriginCity(Long idOriginCity) {
        this.idOriginCity = idOriginCity;
    }

    public Long getIdDestinationCity() {
        return idDestinationCity;
    }

    public void setIdDestinationCity(Long idDestinationCity) {
        this.idDestinationCity = idDestinationCity;
    }
}
