package com.cts.irctc.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;



public class TicketBooking {

	private String fromCity;
	private String toCity;
	
	public TicketBooking() {
		// TODO Auto-generated constructor stub
	}
	
	public TicketBooking(String fromCity, String toCity) {
		super();
		this.fromCity = fromCity;
		this.toCity = toCity;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	

}