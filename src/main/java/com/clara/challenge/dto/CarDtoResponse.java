package com.clara.challenge.dto;

public class CarDtoResponse {
	
	private Long idChasse;
	private String name, color, fabricationYear;
	private String brand;
	
	
	
	public CarDtoResponse(Long idChasse, String name, String brand, String color, String fabricationYear) {
		this.idChasse = idChasse;
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
