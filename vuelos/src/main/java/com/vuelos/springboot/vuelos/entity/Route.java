package com.vuelos.springboot.vuelos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="routes")
public class Route implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_route")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "id_flight")
    private List<Flight> idFlight;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "origin_city", referencedColumnName = "id_city")
    private City originCity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "destination_city", referencedColumnName = "id_city")
    private City destinationCity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Flight> getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(List<Flight> idFlight) {
        this.idFlight = idFlight;
    }

    public City getOriginCity() {
        return originCity;
    }

    public void setOriginCity(City originCity) {
        this.originCity = originCity;
    }

    public City getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(City destinationCity) {
        this.destinationCity = destinationCity;
    }
}
