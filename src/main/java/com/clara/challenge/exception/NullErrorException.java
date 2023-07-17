package com.clara.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NullErrorException extends Exception{
	
	public String NullErrorException(String msg){
		return "Unsaved! Null values aren't acceptable";
	}
}
