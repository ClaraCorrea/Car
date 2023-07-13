package com.clara.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.clara.challenge.dto.CarDtoRequest;
import com.clara.challenge.entity.Car;
import com.clara.challenge.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@GetMapping("/get")
	public String get() {
		return carService.getString();
	}
	
	@PostMapping("/post")
	public Car post(@RequestBody CarDtoRequest carDto) {
		return carService.save(carDto);
	}
	
	@GetMapping("/get2/{id}")
	public Car get2(@PathVariable Long id) {
		return carService.getById(id);
	}

}
