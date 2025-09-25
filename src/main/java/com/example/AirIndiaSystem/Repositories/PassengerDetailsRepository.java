package com.example.AirIndiaSystem.Repositories;

import com.example.AirIndiaSystem.Models.Entities.PassengerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerDetailsRepository extends JpaRepository<PassengerDetails,Long> {

    boolean existById(Long id);
}
