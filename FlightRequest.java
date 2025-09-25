package com.example.AirIndiaSystem.Models.DTOs;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalTime;

@Data
public class FlightRequest {

    @NotNull(message="Flight Name is required")
    private String FlightName;

    @NotNull(message="Flight airline is required")
    private String Airline;

    @NotNull(message="Flight destination is required")
    private String FlightDestination;

    @NotNull(message="Flight arrival time is required")
    private LocalTime FlightArrivalTime;

    @NotNull(message="Flight departure time is required")
    private LocalTime FlightDepartureTime;


}
