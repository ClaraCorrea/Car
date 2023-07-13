package com.clara.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clara.challenge.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository carRepository;

	public String getString() {
		return "Valor vindo do service!";
	}
	
/*	public Car saveCar(Car car2) {
		return car;
	}*/
}
