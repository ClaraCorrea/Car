package com.clara.challenge.dto;

public class ExceptionDto {

	private String statusCode, message;

	public ExceptionDto(String statusCode2, String message2) {
		
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}