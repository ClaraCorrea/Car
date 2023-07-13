package com.clara.challenge.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "car")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idChasse;
	
	@NotBlank(message = "o campo é obrigatório!")
	private String name, color, fabricationYear;
	
	@NotBlank(message = "o campo é obrigatório!")
	private String brand;
	
	public Car(){}

	public Car(String name, String color, String fabricationYear, String brand) {
		this.name = name;
		this.color = color;
		this.fabricationYear = fabricationYear;
		this.brand = brand;
	}
	
	
	public Long getIdChasse() {
		return idChasse;
	}

	public void setIdChasse(Long idChasse) {
		this.idChasse = idChasse;
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
