package com.clara.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clara.challenge.entity.Car;


@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

	
	
}
