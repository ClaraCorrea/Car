package com.clara.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GetErrorException extends Exception{
	public String NullErrorException(String msg){
		return "Not found! Try again with an existing id";
	}
}
