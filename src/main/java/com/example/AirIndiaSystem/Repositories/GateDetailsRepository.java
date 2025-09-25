package com.example.AirIndiaSystem.Repositories;

import com.example.AirIndiaSystem.Models.Entities.GateDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GateDetailsRepository extends JpaRepository<GateDetails,Long> {
}
