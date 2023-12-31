package com.clara.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

import com.clara.challenge.dto.CarDtoRequest;
import com.clara.challenge.dto.CarDtoResponse;
import com.clara.challenge.entity.Car;
import com.clara.challenge.exception.BrandErrorException;
import com.clara.challenge.exception.GetErrorException;
import com.clara.challenge.exception.NullErrorException;
import com.clara.challenge.repository.CarRepository;


@Service
public class CarService {

	public boolean progress = false;

	@Autowired
	CarRepository carRepository;
	
	public void save(CarDtoRequest carDtoRequest) throws BrandErrorException, NullErrorException {
		Car car = new Car(
				carDtoRequest.getName(),
				carDtoRequest.getColor(),
				carDtoRequest.getFabricationYear(),
				carDtoRequest.getBrand()	
				);
		
	    ArrayList<String> brands = new ArrayList<String>();
	    brands.add("FORD");
	    brands.add("CHEVROLET");
	    brands.add("BMW");
	    brands.add("VOLVO");
	    
		if(carDtoRequest.getName().length() <= 0  || carDtoRequest.getColor().length() <= 0 || carDtoRequest.getFabricationYear().length() <= 0 || carDtoRequest.getBrand().length() <= 0) {
			throw new NullErrorException();
		} else {
			for (int i = 0; i < brands.size(); i++) {
				if (brands.contains(carDtoRequest.getBrand().toUpperCase())) {
					carRepository.save(car);	
					progress = true;
				} else {
					throw new BrandErrorException();
				}
			}
		}
	}
	
	public CarDtoResponse getById(Long id)  throws GetErrorException {
		if (carRepository.findById(id).toString().isBlank()) {
			Car car2 =  carRepository.findById(id).orElseThrow();
			CarDtoResponse carDtoResponse = new CarDtoResponse(car2.getIdChassi(), car2.getName(), car2.getBrand().toUpperCase(), car2.getColor(), car2.getFabricationYear());
			return carDtoResponse;
		} else {
			throw new GetErrorException();
		}
	}
}