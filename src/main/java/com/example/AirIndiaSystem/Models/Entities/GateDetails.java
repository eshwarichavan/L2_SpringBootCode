package com.example.AirIndiaSystem.Models.Entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="gate_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GateDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gate_id")
    private Long GateId;

    @Column(name = "gate_name")
    private String GateName;

    //Mapping :


}
