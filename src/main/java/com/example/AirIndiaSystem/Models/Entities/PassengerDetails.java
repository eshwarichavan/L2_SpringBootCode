package com.example.AirIndiaSystem.Models.Entities;

import com.example.AirIndiaSystem.Models.Enums.FlightTypes;
import com.example.AirIndiaSystem.Roles.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Table(name="passenger_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="passenger_id")
    private Long PassengerId;

    @Column(name="Passenger_First_Name")
    private String PassengerFirstName;

    @Column(name="Passenger_Last_Name")
    private String PassengerLastName;

    @Column(name="Email")
    private String Email;

    //have to Bcrypt it
    @Column(name="Password")
    private String Password;

    @Column(name="Check_In_Time")
    private LocalTime CheckInTime;

    @Column(name="Check_Out_Time")
    private LocalTime CheckOutTime;

//
//    //Enums :
//    @Enumerated(EnumType.STRING)   //calling flight types enum
//    private FlightTypes flightType;
//
//    public void setRole(Roles role) {
//        this.role = role;
//    }
//
//    public Roles getRole() {
//        return role;
//    }


//    //Mapping :
//    //one passenger can have one flight at this airport
//    @OneToOne(mappedBy = "flight_id")
//    private FlightDetails flightDetails;

}
