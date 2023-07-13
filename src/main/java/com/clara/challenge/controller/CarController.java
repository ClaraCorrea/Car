package com.clara.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.clara.challenge.dto.CarDtoRequest;
import com.clara.challenge.dto.CarDtoResponse;
import com.clara.challenge.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@PostMapping("/post")
	public String post(@RequestBody CarDtoRequest carDto) {
		carService.save(carDto);
		return "Carro salvo no banco de dados!";
	}
	
	@GetMapping("/get/{id}")
	public CarDtoResponse get2(@PathVariable Long id) {
		return carService.getById(id);
	}

}
