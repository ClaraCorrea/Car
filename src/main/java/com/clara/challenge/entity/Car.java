package com.clara.challenge.entity;

import javax.persistence.*;


@Entity
@Table(name = "car")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idChassi;
	
	private String name, color, fabricationYear;
	
	private String brand;
	
	public Car(){}

	public Car(String name, String color, String fabricationYear, String brand) {
		this.name = name;
		this.color = color;
		this.fabricationYear = fabricationYear;
		this.brand = brand;
	}
	
	
	public Long getIdChassi() {
		return idChassi;
	}

	public void setIdChassi(Long idChassi) {
		this.idChassi = idChassi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFabricationYear() {
		return fabricationYear;
	}

	public void setFabricationYear(String fabricationYear) {
		this.fabricationYear = fabricationYear;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}	

}
