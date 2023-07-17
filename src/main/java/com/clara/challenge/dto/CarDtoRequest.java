package com.clara.challenge.dto;

import javax.validation.constraints.NotBlank;

public class CarDtoRequest {
	
	@NotBlank
	private String name, color, fabricationYear, brand;

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
