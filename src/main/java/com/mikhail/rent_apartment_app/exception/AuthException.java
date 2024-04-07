package com.mikhail.rent_apartment_app.exception;

public class AuthException extends RuntimeException {

    public int statusCod;

    public AuthException(String message, int statusCod) {
        super(message);
        this.statusCod = statusCod;
    }
}

