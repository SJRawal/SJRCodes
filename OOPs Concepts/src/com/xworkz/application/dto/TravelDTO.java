package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class TravelDTO implements Serializable {
	private String destination;
	private LocalDate startDate;
	private LocalDate endDate;
	private int numberOfPeople;
	private boolean isRoundTrip;

	public TravelDTO() {
		System.out.println("Travel no-argument Constructor");
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public boolean isRoundTrip() {
		return isRoundTrip;
	}

	public void setRoundTrip(boolean isRoundTrip) {
		this.isRoundTrip = isRoundTrip;
	}

	@Override
	public String toString() {
		return "TravelDTO [Destination=" + destination + ", Start Date=" + startDate + ", End Date=" + endDate
				+ ", Number Of People=" + numberOfPeople + ", Round Trip=" + isRoundTrip + "]";
	}

}
