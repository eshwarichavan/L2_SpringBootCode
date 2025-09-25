package com.example.AirIndiaSystem.Services;

import com.example.AirIndiaSystem.Models.DTOs.PassengerRequest;
import com.example.AirIndiaSystem.Models.DTOs.PassengerResponse;
import com.example.AirIndiaSystem.Models.Entities.FlightDetails;
import com.example.AirIndiaSystem.Models.Entities.PassengerDetails;
import com.example.AirIndiaSystem.Repositories.PassengerDetailsRepository;
import com.example.AirIndiaSystem.Roles.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerDetailsService {

//    @Autowired
//    private PassengerDetailsRepository passengerDetailsRepository;
//
//    @Autowired
//    private FlightDetails flightDetails;
//
//    //check-in
//    public PassengerResponse checkIn(PassengerRequest passengerRequest){
//
//        if(passengerDetailsRepository.existById(passengerRequest.getEmail())){
//            throw new RuntimeException("Passenger ID already Exists ...");
//        }
//
//        PassengerDetails passengerDetails= new PassengerDetails();
//        passengerDetails.setPassengerFirstName(passengerRequest.getPassengerFirstName());
//        passengerDetails.setPassengerLastName(passengerRequest.setPassengerLastName());
//        passengerDetails.setEmail(passengerRequest.setEmail());
//        passengerDetails.setRole(Roles.PASSENGERS);
//
//        PassengerDetails savedPassenger=passengerDetailsRepository.save(passengerDetails);
//
//        return new PassengerResponse(
//                savedPassenger.setPassengerFirstName(),
//                savedPassenger.setPassengerLastName(),
//                savedPassenger.setEmail(),
//                savedPassenger.setRole().toString()
//        );
//
//    }

//    public PassengerResponse beforeCutOff(PassengerDetails passengerDetails){
//
//        //Only allow check-in before a certain cut-off time
//        if(passengerDetails.getCheckInTime().isBefore(flightDetails.getFlightArrivalTime())){
//            return
//        }
//    }


}
