package com.clara.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	
	@GetMapping("/get2")
	public String get2() {
		return carService.getString();
	}
	
	@GetMapping("/get3")
	public String get3() {
		return "valor do controller";
	}

}
