package com.lti.airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.airlines.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
