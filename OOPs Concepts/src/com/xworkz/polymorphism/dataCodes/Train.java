package com.xworkz.polymorphism.dataCodes;

public class Train {
	public int trainNumber;
    public String trainName;
    public String departure;
    public String destination;
    public String departureTime;
    public String arrivalTime;
    public int totalSeats;
    public int availableSeats;
    	
public Train(int tN) {
    	
    	trainNumber=tN;


    }
public Train(int tN,String a) {
	
	trainNumber=tN;
	trainName=a;


}
public Train(int tN,String a,String d) {
	
	trainNumber=tN;
	trainName=a;
	departure=d;


}   
public Train(int tN,String a,String d,String dn) {
	
	trainNumber=tN;
	trainName=a;
	departure=d;
	destination=dn;


}   
public Train(int tN,String a,String d,String dn,String dT) {
	
	trainNumber=tN;
	trainName=a;
	departure=d;
	destination=dn;
	departureTime=dT;


}   
public Train(int tN,String a,String d,String dn,String dT,String aT) {
	
	trainNumber=tN;
	trainName=a;
	departure=d;
	destination=dn;
	departureTime=dT;
	arrivalTime=aT;


}   
public Train(int tN,String a,String d,String dn,String dT,String aT,int tS) {
	
	trainNumber=tN;
	trainName=a;
	departure=d;
	destination=dn;
	departureTime=dT;
	arrivalTime=aT;
	totalSeats=tS;

}   
public Train(int tN,String a,String d,String dn,String dT,String aT,int tS,int aS) {
    	
    	trainNumber=tN;
    	trainName=a;
    	departure=d;
    	destination=dn;
    	departureTime=dT;
    	arrivalTime=aT;
    	totalSeats=tS;
    	availableSeats=aS;

    }
public void ShowTrain() {
	
	System.out.println("Train Number "+trainNumber);
	System.out.println("Train Name "+trainName);
	System.out.println("Train Departure "+departure);
	System.out.println("Train destination "+destination);
	System.out.println("Train departure time "+departureTime);
	System.out.println("Train arrival time "+arrivalTime);
	System.out.println("Train total seats "+totalSeats);
	System.out.println("Train available seats "+availableSeats);

}
}
