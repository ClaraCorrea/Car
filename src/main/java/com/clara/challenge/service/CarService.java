package com.clara.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clara.challenge.dto.CarDtoRequest;
import com.clara.challenge.entity.Car;
import com.clara.challenge.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository carRepository;

	public Car save(CarDtoRequest carDtoRequest) {
		Car car = new Car(
				carDtoRequest.getName(),
				carDtoRequest.getColor(),
				carDtoRequest.getFabricationYear(),
				carDtoRequest.getBrand()
				);
		carRepository.save(car);
		return car;
	}


	public Car getById(Long id) {
		return carRepository.findById(id).orElseThrow();
	}

