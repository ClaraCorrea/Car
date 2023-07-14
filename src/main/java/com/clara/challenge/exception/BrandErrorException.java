package com.clara.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class BrandErrorException extends Exception {

	public String BrandErrorException(String msg){
		return "Unsaved";
	}
	

}
