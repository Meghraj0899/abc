package com.lti.airlines.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="flights_master")
public class Flight {
	@Id
	@Column(name="flight_no")
	private int flight_no;
	@Column(nullable = false)
	private String flight_name;
	@Column(nullable = false)
	private String source;
	@Column(nullable = false)
	private String destination;
	@Column(nullable = false)
	private int duration;
	@Column(nullable = false)
	private String status;
	@Column(nullable = false)
	private double economic_class_fare;
	@Column(nullable = false)
	private double Business_class_fare;
	@Column(nullable = false)
	private int no_of_economic_seats;
	@Column(nullable = false)
	private int no_of_business_seats;
	
	public int getFlight_no() {
		return flight_no;
	}
	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getEconomic_class_fare() {
		return economic_class_fare;
	}
	public void setEconomic_class_fare(double economic_class_fare) {
		this.economic_class_fare = economic_class_fare;
	}
	public double getBusiness_class_fare() {
		return Business_class_fare;
	}
	public void setBusiness_class_fare(double business_class_fare) {
		Business_class_fare = business_class_fare;
	}
	public int getNo_of_economic_seats() {
		return no_of_economic_seats;
	}
	public void setNo_of_economic_seats(int no_of__economic_seats) {
		this.no_of_economic_seats = no_of__economic_seats;
	}
	public int getNo_of_business_seats() {
		return no_of_business_seats;
	}
	public void setNo_of_business_seats(int no_of_business_seats) {
		this.no_of_business_seats = no_of_business_seats;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
