package com.vuelos.springboot.vuelos.repository;

import com.vuelos.springboot.vuelos.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFlightsrepo extends JpaRepository<Flight, Integer> {

}
