package com.example.AirIndiaSystem.Exception;

import org.springframework.stereotype.Component;

@Component
public class FlightNotFoundException extends Exception{

    public FlightNotFoundException(String message) {
        super(message);
    }

    public FlightNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
