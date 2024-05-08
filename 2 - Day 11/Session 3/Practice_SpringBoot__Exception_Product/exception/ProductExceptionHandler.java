package com.example.springapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {
    
    @ExceptionHandler(ProductException.class)
    public ResponseEntity<String> getProductHandlerException(ProductException e){
         return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
    }
}
