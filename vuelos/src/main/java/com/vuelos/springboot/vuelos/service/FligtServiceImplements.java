package com.vuelos.springboot.vuelos.service;

import com.vuelos.springboot.vuelos.entity.Flight;
import com.vuelos.springboot.vuelos.repository.IFlightsrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FligtServiceImplements implements IFlightService{

    @Autowired
    private IFlightsrepo flightRepo;

    @Override
    public Flight save(Flight flight) {
        return flightRepo.save(flight);
    }
}
