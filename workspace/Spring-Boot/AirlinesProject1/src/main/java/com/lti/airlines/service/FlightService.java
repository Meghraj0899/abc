package com.lti.airlines.service;

import java.util.List;

import com.lti.airlines.model.Flight;
import com.lti.airlines.model.FlightSchedule;

public interface FlightService {
	public boolean addFlight(Flight flight);
	public boolean updateFlight(Flight flight);
	public boolean deleteFlight(int flightno);
	public List<Flight> getFlights();
	public boolean addSchedule(FlightSchedule fs);
	public List<FlightSchedule> scheduleFlight();
	public boolean removeSchedule(int scheduleId);

}
