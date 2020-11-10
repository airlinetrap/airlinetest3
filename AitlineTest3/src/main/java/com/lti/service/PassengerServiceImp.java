package com.lti.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.lti.dto.PassengerDto;
import com.lti.entity.Passenger;
import com.lti.exception.FlightServiceException;
import com.lti.exception.PassengerServiceException;
import com.lti.repository.PassengerRepo;

@Service
public class PassengerServiceImp implements PassengerService {
@Autowired
PassengerRepo passengerRepo;
	@Override
	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		try {
			int passengerId=passengerRepo.addApassenger(passenger);

		}
		catch(EmptyResultDataAccessException e)
		{
			throw new PassengerServiceException("Passenger Could not be added");
		}


	}
	@Override
	public Passenger getPassenger(int passengerId) {
		// TODO Auto-generated method stub
		return passengerRepo.findPassengerById(passengerId);
	}
	@Override
	public List<Passenger> viewAllPassenger(int userId, int flightId,LocalDate dateOfTravel) {
		// TODO Auto-generated method stub
		return passengerRepo.viewPassenger(userId, flightId,dateOfTravel);
	}

}
