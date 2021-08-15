package com.lti.airlines.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airlines.model.Flight;
import com.lti.airlines.model.FlightSchedule;
import com.lti.airlines.repository.FlightRepository;
import com.lti.airlines.repository.ScheduleRepository;

@Service
@Transactional
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	FlightRepository flightRepo;
	
	@Autowired
	ScheduleRepository sRepo;

	@Override
	public boolean addFlight(Flight flight) {
		flightRepo.save(flight);
		return true;
	}

	@Override
	public boolean updateFlight(Flight flight) {
		Flight f=flightRepo.findById(flight.getFlight_no()).get();
		f=flight;
		flightRepo.save(f);
		
		return true;
	}

	@Override
	public boolean deleteFlight(int flightno) {
		flightRepo.deleteById(flightno);
		
		return true;
	}

	@Override
	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		return flightRepo.findAll();
	}

	@Override
	public boolean addSchedule(FlightSchedule fs) {
		// TODO Auto-generated method stub
		sRepo.save(fs);
		return true;
	}

	@Override
	public List<FlightSchedule> scheduleFlight() {
		// TODO Auto-generated method stub
		return sRepo.findAll();
		
	}

	@Override
	public boolean removeSchedule(int scheduleId) {
		sRepo.deleteById(scheduleId);
		return true;
	}


}
