package com.example.AirIndiaSystem.Models.DTOs;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class PassengerRequest {

    @NotNull(message="Passenger first name is required")
    private String PassengerFirstName;

    @NotNull(message="Passenger last name is required")
    private String PassengerLastName;

    @NotNull(message="Passenger email is required")
    private String Email;
}
