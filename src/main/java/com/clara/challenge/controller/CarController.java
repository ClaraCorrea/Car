package com.clara.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.clara.challenge.dto.CarDtoRequest;
import com.clara.challenge.dto.CarDtoResponse;
import com.clara.challenge.exception.BrandErrorException;
import com.clara.challenge.exception.ErrorBrand;
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
	
	@PostMapping("/post2")
	public String post2(@RequestBody CarDtoRequest carDto) throws BrandErrorException, ErrorBrand {
		carService.save3(carDto);
		if(carService.progress == true) {			
			return "Saved";
		} else {
			return "Problem to salve!";
		}
	}
	
	@GetMapping("/get/{id}")
	public CarDtoResponse get2(@PathVariable Long id) throws BrandErrorException {
		return carService.getById(id);
	}

}
