package com.clara.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clara.challenge.dto.CarDtoRequest;
import com.clara.challenge.dto.CarDtoResponse;
import com.clara.challenge.entity.Car;
import com.clara.challenge.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository carRepository;

	public void save(CarDtoRequest carDtoRequest) {
		Car car = new Car(
				carDtoRequest.getName(),
				carDtoRequest.getColor(),
				carDtoRequest.getFabricationYear(),
				carDtoRequest.getBrand()
				);
		carRepository.save(car);
	}


	public CarDtoResponse getById(Long id) {
		Car car =  carRepository.findById(id).orElseThrow();
		
		CarDtoResponse carDtoResponse = new CarDtoResponse(car.getIdChasse(), car.getName(), car.getBrand(), car.getColor(), car.getFabricationYear())
		return carDtoResponse;
	}
}