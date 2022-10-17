package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.model.Plane;
import net.guides.springboot2.springboot2jpacrudexample.repository.PlaneRepository;

@RestController
@RequestMapping("/api/planes")
public class PlaneController {
	@Autowired
	private PlaneRepository planeRepository;
	@GetMapping("/all")
	public List<Plane> getAllPlant() {
		return planeRepository.findAll();
	}
	@GetMapping("/datlat")
	public List<Plane> getPlanesToDalat() {
		return planeRepository.findAll();
	}

}
