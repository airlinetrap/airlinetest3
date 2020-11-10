package com.lti.service;

import java.time.LocalDate;
import java.util.List;

import com.lti.dto.PassengerDto;
import com.lti.entity.Passenger;

public interface PassengerService {
	void addPassenger(Passenger passenger);
	Passenger getPassenger(int passengerId );
	List<Passenger> viewAllPassenger(int userId,int flightId,LocalDate dateOfTravel);

}
