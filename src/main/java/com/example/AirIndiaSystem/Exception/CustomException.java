package com.example.AirIndiaSystem.Exception;

import org.springframework.stereotype.Component;

@Component
public class CustomException extends Exception{

    public CustomException (String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
