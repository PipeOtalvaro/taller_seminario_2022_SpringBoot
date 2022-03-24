package com.vuelos.springboot.vuelos.controller;

import com.vuelos.springboot.vuelos.entity.Flight;
import com.vuelos.springboot.vuelos.repository.IFlightsrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoutesController {

    @Autowired
    private IFlightsrepo flightsRepo;

    @GetMapping("/FlightsByRoute")
    public List<Flight> fligthsByRoutes(){

        return  flightsRepo.findAll();
    }

}
