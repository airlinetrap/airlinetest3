package com.lti.service;

import java.util.List;

import com.lti.dto.SelectFlightDto;
import com.lti.entity.Flight;
import com.lti.entity.User;

public interface FlightService {
	void addFlight(Flight flight);

	List<Flight> search(String from, String to);

	List<Flight> viewAllFlight();
	List<String> viewFlightFrom();
	List<String> viewFlightTo();
	Flight get(int flightNo);

}
