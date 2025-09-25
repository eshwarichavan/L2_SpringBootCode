package com.example.AirIndiaSystem.Models.DTOs;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PassengerResponse {

    @NotNull(message="Passenger id is required")
    private Long PassengerId;

    @NotNull(message="Passenger first name is required")
    private String PassengerFirstName;

    @NotNull(message="Passenger last name is required")
    private String PassengerLastName;

    @NotNull(message="Passenger email is required")
    private String Email;
}
