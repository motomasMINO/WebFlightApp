package com.flight.demo;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightService {
    private final FlightRepository repository;

    public FlightService(FlightRepository repository) {
        this.repository = repository;
    }

    public List<Flight> getAllFlights() {
        return repository.findAll();
    }
}

