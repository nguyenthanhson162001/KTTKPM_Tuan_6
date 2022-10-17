package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.model.Flight;
import net.guides.springboot2.springboot2jpacrudexample.repository.FlightRepository;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
	@Autowired
	private FlightRepository flightRepository;
	@GetMapping("/all")
	public List<String> getAllPlant() {
		return Arrays.asList("S");
	}
	@GetMapping("/dalat")
	public List<Flight> getPlanesToDalat() {
		return flightRepository.findFlightGoToArrivals("DAD");
	}
}
