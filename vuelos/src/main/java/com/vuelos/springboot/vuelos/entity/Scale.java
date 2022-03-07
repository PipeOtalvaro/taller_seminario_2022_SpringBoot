package com.vuelos.springboot.vuelos.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table
public class Scale implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_scale")
    private Long id;

    @Column(name ="id_route")
    private Long idRoute;

    @Column(name ="id_stopover_city")
    private Long idStopoverCity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(Long idRoute) {
        this.idRoute = idRoute;
    }

    public Long getIdStopoverCity() {
        return idStopoverCity;
    }

    public void setIdStopoverCity(Long idStopoverCity) {
        this.idStopoverCity = idStopoverCity;
    }
}
