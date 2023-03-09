package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.data.DvgRailwayStation;
import com.xworkz.abstraction.data.RailwayStation;

public class RailwayStationBoot {

	public static void main(String[] args) {
		
		RailwayStation railwayStation = new DvgRailwayStation();
		System.out.println(railwayStation.minimumPlatforms());
		System.out.println(railwayStation.parkingArea());
		System.out.println(railwayStation.stationFunctional());
		System.out.println(railwayStation.stationName());
		DvgRailwayStation dvgStation = new DvgRailwayStation();
		System.out.println(dvgStation.totalTrain());
		System.out.println(dvgStation.trackPassing());
		System.out.println(dvgStation.trainSchedule());
		System.out.println(dvgStation.platforms());
	}

}
