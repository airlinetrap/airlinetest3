package com.lti.repository;
import java.time.LocalDate;
import java.util.List;

import com.lti.dto.PassengerDto;
import com.lti.entity.Passenger;

public interface PassengerRepo {

	public int addApassenger(Passenger passenger );
	public Passenger findPassengerById(int passengerId);
	public List<Passenger> viewPassenger(int userId,int flightId,LocalDate dateOfTravel);
	//public boolean findFlightInPassenger(int flightId);
	

}
