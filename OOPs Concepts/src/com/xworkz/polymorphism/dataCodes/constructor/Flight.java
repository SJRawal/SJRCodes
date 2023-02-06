package com.xworkz.polymorphism.dataCodes.constructor;

public class Flight {
	public int flightNumber;
    public String airline;
    public String departure;
    public String destination;
    public String departureTime;
    public String arrivalTime;
    public int totalSeats;
    public int availableSeats;
    public float ticketPrice;
    public String flightDate;
    
    public Flight(int fN,String a,String d,String dn,String dT,String aT,int tS,int aS,float tP,String fD) {
    	
    	flightNumber=fN;
    	airline=a;
    	departure=d;
    	destination=dn;
    	departureTime=dT;
    	arrivalTime=aT;
    	totalSeats=tS;
    	availableSeats=aS;
    	ticketPrice=tP;
    	flightDate=fD;
    }
    public void Display() {
    	
    	System.out.println("Flight Number "+flightNumber);
    	System.out.println("Flight Airline "+airline);
    	System.out.println("Flight Departure "+departure);
    	System.out.println("Flight destination "+destination);
    	System.out.println("Flight departure time "+departureTime);
    	System.out.println("Flight arrival time "+arrivalTime);
    	System.out.println("Flight total seats "+totalSeats);
    	System.out.println("Flight available seats "+availableSeats);
    	System.out.println("Flight ticket price "+ticketPrice);
    	System.out.println("Flight flight date "+flightDate);
    }
}
