package com.example.AirIndiaSystem.Controllers;

import com.example.AirIndiaSystem.Exception.FlightNotFoundException;
import com.example.AirIndiaSystem.Models.DTOs.FlightRequest;
import com.example.AirIndiaSystem.Models.DTOs.FlightResponse;
import com.example.AirIndiaSystem.Models.Entities.FlightDetails;
import com.example.AirIndiaSystem.Services.FlightDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController  //using rest instead of controller as it inlcudes Controller + ResponseBody
@RequestMapping("/api/flights")   //body to the api
public class FlightDetailsController {

    @Autowired
    private FlightDetailsService flightDetailsService;

    //to get data
    @PostMapping
    public FlightDetails createFlight(@RequestBody FlightDetails flightDetails){
        return flightDetailsService.createFlight(flightDetails);
    }


    //get all flights
    @GetMapping
    public ResponseEntity<List<FlightDetails>> getAllFlights(@RequestBody FlightRequest flightRequest){
        List<FlightDetails> response=flightDetailsService.getAllFlights(flightRequest);

        //using ResponseEntity to get HTTPstatus code to our response of the client side
        return ResponseEntity.ok(response);
    }


    //get Flight by Date
    @GetMapping("/{id}")
    public ResponseEntity<FlightResponse> getByDate(@PathVariable LocalDate date){
        FlightDetails response=flightDetailsService.getFlightByDate(date);
        FlightResponse flightResponse=new FlightResponse();
        flightResponse.setFlightDate(response.getFlightDate());
        return ResponseEntity.ok(flightResponse);
    }

    //delete By Id FightDetails
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        FlightResponse response=flightDetailsService.deleteByIdFightDetails(id);
        ResponseEntity.ok(response);
    }


    //update flight details
    @PutMapping("/{id}")
    public ResponseEntity<FlightResponse> updateFlightDetails(@PathVariable Long id, @RequestBody FlightRequest flightRequest) throws FlightNotFoundException {
        FlightDetails flightDetails=flightDetailsService.updateFlightDetails(id,flightRequest);
        FlightResponse flightResponse=new FlightResponse();
        flightResponse.setFlightDate(flightDetails.getFlightDate());
        flightResponse.setFlightName(flightDetails.getFlightName());
        flightResponse.setFlightDestination(flightDetails.getFlightDestination());
        return ResponseEntity.ok(flightResponse);
    }


}
