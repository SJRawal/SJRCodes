package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.TravelDTO;

public class TravelData {

	public static void main(String[] args) {
		TravelDTO travel = new TravelDTO();
		travel.setDestination("Mangalore");
		travel.setNumberOfPeople(9);
		travel.setStartDate(LocalDate.of(2023, 03, 10));
		travel.setEndDate(LocalDate.of(2023, 03, 12));
		travel.setRoundTrip(true);

		System.out.println(travel);

	}

}
