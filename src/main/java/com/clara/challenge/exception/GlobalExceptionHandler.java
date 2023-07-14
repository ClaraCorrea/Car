package com.clara.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.clara.challenge.dto.ExceptionDto;

@ControllerAdvice
public class GlobalExceptionHandler {
	
/*   @ExceptionHandler(BrandErrorException.class)
    public ResponseEntity<ExceptionDto> BrandErrorException(BrandErrorException e){
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(
            new ExceptionDto("NOT_ACCETABLE", "WRONG BRAND")
        );
    }*/
}