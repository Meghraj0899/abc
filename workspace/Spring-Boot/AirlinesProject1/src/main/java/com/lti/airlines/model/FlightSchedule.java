package com.lti.airlines.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="flight_schedule")
public class FlightSchedule {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int scheduleId;
	
//	@Column(nullable = false)
	private int flight_number;
	@Column(nullable = false)
	private String arrival_date;
	@Column(nullable = false)
	private String departure_date;
	@Column(nullable = false)
	private String departure_time;
	@Column(nullable = false)
	private String arrival_time;
	@Column(nullable = false)
	private int no_of_available_economic_seats;
	@Column(nullable = false)
	private int no_of_available_business_seats;
	private int adminId;
	
	@ManyToOne(cascade = CascadeType.ALL ,optional = false)
	@JoinColumn(name = "flight_number", referencedColumnName = "flight_no" ,insertable = false,updatable = false)
	private Flight flight;

	
	public FlightSchedule(int scheduleId, int flight_number, String arrival_date, String departure_date,
			String departure_time, String arrival_time, int no_of_available_economic_seats,
			int no_of_available_business_seats, int adminId) {
		super();
		this.scheduleId = scheduleId;
		this.flight_number = flight_number;
		this.arrival_date = arrival_date;
		this.departure_date = departure_date;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.no_of_available_economic_seats = no_of_available_economic_seats;
		this.no_of_available_business_seats = no_of_available_business_seats;
		this.adminId = adminId;
	}
	public FlightSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public int getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(int flight_number) {
		this.flight_number = flight_number;
	}
	public String getArrival_date() {
		return arrival_date;
	}
	public void setArrival_date(String arrival_date) {
		this.arrival_date = arrival_date;
	}
	public String getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public int getNo_of_available_economic_seats() {
		return no_of_available_economic_seats;
	}
	public void setNo_of_available_economic_seats(int no_of_available_economic_seats) {
		this.no_of_available_economic_seats = no_of_available_economic_seats;
	}
	public int getNo_of_available_business_seats() {
		return no_of_available_business_seats;
	}
	public void setNo_of_available_business_seats(int no_of_available_business_seats) {
		this.no_of_available_business_seats = no_of_available_business_seats;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	

}
