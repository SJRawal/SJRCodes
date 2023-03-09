package com.xworkz.abstraction.data;

public class DvgRailwayStation implements RailwayStation{

	@Override
	public int minimumPlatforms() {
		System.out.println("Minimum Platforms: ");
		return 2;
	}

	@Override
	public String trackPassing() {
		System.out.println("People should pass through tracking: ");
		return "Will be fined";
	}

	@Override
	public boolean trainSchedule() {
		System.out.println("Train Schedule there: ");
		return true;
	}

	@Override
	public boolean stationFunctional() {
		System.out.println("Station is functional: ");
		return true;
	}

	@Override
	public boolean platforms() {
		System.out.println("Platforms empty? ");
		return false;
	}

	@Override
	public float parkingArea() {
		System.out.println("Total Parking Area: ");
		return 100.5f;
	}

	@Override
	public int totalTrain() {
		System.out.println("Total trains ");
		return 3;
	}

	@Override
	public String stationName() {
		System.out.println("Station name is: ");
		return "Davangere";
	}


}
