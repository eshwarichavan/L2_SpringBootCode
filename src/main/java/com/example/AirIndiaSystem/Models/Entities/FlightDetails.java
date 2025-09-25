package com.example.AirIndiaSystem.Models.Entities;

import com.example.AirIndiaSystem.Models.DTOs.FlightResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity  //for JPA : enables the jpa configuration with db to understand its an entity
@Table(name="flight_details")
@Data  //for lombok : enables to create getter-setters, .equals, hashcode() etc
@AllArgsConstructor
@NoArgsConstructor
public class FlightDetails {

    @Id  //primary key: will use P.K as FlightId in the db as well
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto increments the values for us
    @Column(name="flight_id")
    private Long FlightId;

    @Column(name="airline")
    private String Airline;

    @Column(name="flight_destination")
    private String FlightDestination;

    @Column(name="FlightName")
    private String FlightName;

    @Column(name="flight_date")
    private LocalDate FlightDate;

    @Column(name="flight_arrival_time")
    private LocalTime FlightArrivalTime;

    @Column(name="flight_departure_time")
    private LocalTime FlightDepartureTime;

    @Column(name="flight_duration")
    private String FlightDuration;



}
