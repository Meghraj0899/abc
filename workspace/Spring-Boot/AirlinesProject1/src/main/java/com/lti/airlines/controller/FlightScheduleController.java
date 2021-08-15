package com.lti.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airlines.model.FlightSchedule;
import com.lti.airlines.service.FlightService;

@RestController
@RequestMapping("/flightSchedule/api")
@CrossOrigin(origins="http://localhost:4200")
public class FlightScheduleController {
	@Autowired
	FlightService fService;
	
	@GetMapping("/schedule")
	public List<FlightSchedule> scheduleFlight() {
		return fService.scheduleFlight();
		
	}
	@PostMapping("/schedule")
	public boolean addSchedule(@RequestBody FlightSchedule fs) {
		fService.addSchedule(fs);
		return true;
	}
	@DeleteMapping("/schedule/{scheduleId}")
	public boolean removeSchedule(@PathVariable(value="scheduleId") int scheduleId) {
		return fService.removeSchedule(scheduleId);
	}
}
