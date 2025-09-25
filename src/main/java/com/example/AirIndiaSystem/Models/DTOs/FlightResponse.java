package com.example.AirIndiaSystem.Models.DTOs;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlightResponse {

    @NotNull(message="Flight Id is required")
    private Long FlightId;

    @NotNull(message="Flight Name is required")
    private String FlightName;

    @NotNull(message="Airnline Name is required")
    private String Airline;

    @NotNull(message="fight date Name is required")
    private LocalDate FlightDate;

    @NotNull(message="Flight destination is required")
    private String FlightDestination;

    @NotNull(message="Flight arrivale time is required")
    private LocalTime FlightArrivalTime;

    @NotNull(message="Flight departure time is required")
    private LocalTime FlightDepartureTime;


}
