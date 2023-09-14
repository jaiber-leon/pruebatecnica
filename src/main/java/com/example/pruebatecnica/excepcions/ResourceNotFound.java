package com.example.pruebatecnica.excepcions;

public class ResourceNotFound extends RuntimeException{

    public  ResourceNotFound (String message){
        super(message);
    }
}
