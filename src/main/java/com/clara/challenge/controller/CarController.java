package com.clara.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.clara.challenge.dto.CarDtoRequest;
import com.clara.challenge.dto.CarDtoResponse;
import com.clara.challenge.exception.BrandErrorException;
import com.clara.challenge.exception.GetErrorException;
import com.clara.challenge.exception.NullErrorException;
import com.clara.challenge.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@PostMapping("/post")
	public String post(@RequestBody CarDtoRequest carDto) throws BrandErrorException, NullErrorException {
		carService.save(carDto);
		if(carService.progress == true) {			
			return "Saved";
		} else {
			return "Problem to salve!";
		}
	}
	
	@GetMapping("/get/{id}")
	public CarDtoResponse get2(@PathVariable Long id) throws GetErrorException {
		return carService.getById(id);
	}

}
