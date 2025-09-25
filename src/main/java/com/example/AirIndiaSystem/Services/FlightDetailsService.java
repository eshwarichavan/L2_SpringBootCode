package com.example.AirIndiaSystem.Services;

import com.example.AirIndiaSystem.Exception.FlightNotFoundException;
import com.example.AirIndiaSystem.Models.DTOs.FlightRequest;
import com.example.AirIndiaSystem.Models.DTOs.FlightResponse;
import com.example.AirIndiaSystem.Models.Entities.FlightDetails;
import com.example.AirIndiaSystem.Repositories.FlightDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class FlightDetailsService {

    @Autowired
    private FlightDetailsRepository flightDetailsRepository;


    public FlightDetails createFlight(FlightDetails flightDetails){
        return flightDetailsRepository.save(flightDetails);
    }


    //adding new and saving the flight details
    public List<FlightDetails> getAllFlights(FlightRequest flightRequest) {
        List<FlightDetails> flightDetails = flightDetailsRepository.findAll();
        return flightDetails;
    }

    //get Flight by Date
    public FlightDetails getFlightByDate(LocalDate FlightDate){
        return flightDetailsRepository.getFlightByDate(FlightDate);
    }

    //update
    public FlightDetails updateFlightDetails(Long FlightId, FlightRequest flightRequest) throws FlightNotFoundException {
        FlightDetails flightDetails=flightDetailsRepository.findById(FlightId)
                .orElseThrow(() ->new FlightNotFoundException("User not found..."));

        flightDetails.setAirline(flightRequest.getAirline());
        flightDetails.setFlightDuration(flightDetails.getFlightDuration());
        flightDetails.setFlightDestination(flightDetails.getFlightDestination());

        return flightDetailsRepository.save(flightDetails);
    }

    //delete
    public FlightResponse deleteByIdFightDetails(Long id){
         flightDetailsRepository.deleteById(id);
        return null;
    }


    //for filtering and sorting
    public FlightResponse getFilterSortingFlight(String Airline ,
                                                 String FlightDestination,
                                                 LocalTime FlightArrivalTime,
                                                 LocalTime FlightDepartureTime){

        FlightDetails flightDetails1=flightDetailsRepository.findByAirline(Airline);
        FlightDetails flightDetails2=flightDetailsRepository.findByDestination(FlightDestination);
        FlightDetails flightDetails3=flightDetailsRepository.findbyFlightArrivalTime(FlightArrivalTime);
        FlightDetails flightDetails4=flightDetailsRepository.findByFlightDepartureTime(FlightDepartureTime);


        FlightDetails flightDetails=new FlightDetails();
        if(flightDetails.getFlightArrivalTime().isBefore(flightDetails.getFlightDepartureTime())){
            throw new RuntimeException("Flight Must not have arrival time earlier than departure time.");
        }
        return mapToFlightResponse(flightDetails);
    }


    private FlightResponse mapToFlightResponse(FlightDetails flightDetails) {
        return FlightResponse.builder()
                .FlightId(flightDetails.getFlightId())
                .FlightName(flightDetails.getFlightName())
                .Airline(flightDetails.getAirline())
                .FlightDate(flightDetails.getFlightDate())
                .FlightDestination(flightDetails.getFlightDestination())
                .FlightArrivalTime(flightDetails.getFlightArrivalTime())
                .FlightDepartureTime(flightDetails.getFlightDepartureTime())
                .build();
    }

    }


