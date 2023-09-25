package com.example.pruebatecnica.excepcions;

public class BadRequestException extends RuntimeException{
    public BadRequestException (String message){
        super(message);
    }
}
