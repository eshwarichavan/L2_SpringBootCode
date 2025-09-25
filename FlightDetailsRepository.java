package com.example.AirIndiaSystem.Repositories;

import com.example.AirIndiaSystem.Models.DTOs.FlightRequest;
import com.example.AirIndiaSystem.Models.DTOs.FlightResponse;
import com.example.AirIndiaSystem.Models.Entities.FlightDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface FlightDetailsRepository extends JpaRepository<FlightDetails,Long> {

   //custom method to get flight by date
    FlightDetails getFlightByDate(LocalDate flightDetails);

    FlightDetails findByAirline(String airline);

    FlightDetails findByDestination(String flightDestination);

    FlightDetails findbyFlightArrivalTime(LocalTime flightArrivalTime);

    FlightDetails findByFlightDepartureTime(LocalTime flightDepartureTime);

    List<FlightDetails> findAll();

}
