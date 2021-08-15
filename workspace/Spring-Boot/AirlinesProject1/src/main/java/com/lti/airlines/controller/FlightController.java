package com.lti.airlines.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airlines.model.Flight;
import com.lti.airlines.service.FlightService;

@RestController
@RequestMapping("/flightRest/api")
@CrossOrigin(origins="http://localhost:4200")
public class FlightController {
	@Autowired
	FlightService fService;
	
	@GetMapping("/flights")
	public List<Flight> getFlights(){
		return fService.getFlights();
	}
	@PostMapping("/flights")
	public boolean addFlight(@RequestBody Flight flight) {
		return fService.addFlight(flight);
	}
	
	@PutMapping("/flights")
	public boolean updateFlight(@RequestBody Flight flight) {
		return fService.updateFlight(flight);
	}
	
	@DeleteMapping("/flights/{flight_number}")
	public boolean deleteFlight(@PathVariable(value="flight_number") int f_no) {
		return fService.deleteFlight(f_no);
	}
	
	
}
