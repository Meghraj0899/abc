package com.lti.airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.airlines.model.FlightSchedule;

@Repository
public interface ScheduleRepository extends JpaRepository<FlightSchedule,Integer>{

}
