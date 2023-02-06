package com.xworkz.polymorphism.boot.constructor;
import com.xworkz.polymorphism.dataCodes.constructor.Flight;
public class FlightData {

	public static void main(String[] args) {
		Flight flight = new Flight(6247,"IndiGo","Bengalur","Delhi"," 04:25","07:15",180,78,9544.99f,"Feburary 01");
		flight.Display();
		
		System.out.println("_____________________ \n \n Another Flight Details \n ___________________");
		
		Flight flight1 = new Flight(810,"Air Vistara","Bengalur","Delhi"," 07:00","09:35",200,55,8644.59f,"Feburary 01");
		flight1.Display();
		
	}

}
