package com.clara.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clara.challenge.dto.CarDtoRequest;
import com.clara.challenge.dto.CarDtoResponse;
import com.clara.challenge.entity.Car;
import com.clara.challenge.exception.BrandErrorException;
import com.clara.challenge.repository.CarRepository;

@Service
public class CarService {

	public boolean progress = false;
	
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
	
	public Boolean save2(CarDtoRequest carDtoRequest) throws BrandErrorException  {
		Car car = new Car(
				carDtoRequest.getName(),
				carDtoRequest.getColor(),
				carDtoRequest.getFabricationYear(),
				carDtoRequest.getBrand()	
				);
		if(carDtoRequest.getBrand().equalsIgnoreCase("Ford")) {
			carRepository.save(car);
			progress = true;
		} else {
			throw new BrandErrorException();
		}

		return progress;
	}
	
	public String save3(CarDtoRequest carDtoRequest) throws BrandErrorException {
		Car car = new Car(
				carDtoRequest.getName(),
				carDtoRequest.getColor(),
				carDtoRequest.getFabricationYear(),
				carDtoRequest.getBrand()	
				);
		if(carDtoRequest.getBrand().equalsIgnoreCase("Ford")) {
			carRepository.save(car);
			return "Saved: ";
		} else {
			throw new BrandErrorException();
		}
	}


	public CarDtoResponse getById(Long id)  throws BrandErrorException {
		Car car =  carRepository.findById(id).orElseThrow();
		
		CarDtoResponse carDtoResponse = new CarDtoResponse(car.getIdChasse(), car.getName(), car.getBrand(), car.getColor(), car.getFabricationYear());
		return carDtoResponse;
	}
}