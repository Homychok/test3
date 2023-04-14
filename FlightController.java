package com.example.test3.controller;

import com.example.test3.dto.FilterDTO;
import com.example.test3.dto.FlightDTO;
import com.example.test3.model.Flight;
import com.example.test3.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private FlightService flightService;
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }
    @GetMapping
    public List<FlightDTO> getFlights(FilterDTO filterDTO) {
        return flightService.getFlightsFiltered(filterDTO);
    }

        @GetMapping("/{id}")
        public Flight getFlight(@PathVariable Long id) {
            return flightService.getFlightById(id);
        }


    }