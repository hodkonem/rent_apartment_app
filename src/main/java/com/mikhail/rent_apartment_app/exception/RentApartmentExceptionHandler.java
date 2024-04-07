package com.mikhail.rent_apartment_app.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RentApartmentExceptionHandler {

    @ExceptionHandler(AuthException.class)
    public ResponseEntity<?> interceptionException(AuthException exception) {
        return ResponseEntity.status(exception.statusCod).body(exception.getMessage());
    }
}
