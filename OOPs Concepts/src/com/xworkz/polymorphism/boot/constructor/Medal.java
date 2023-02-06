package com.xworkz.polymorphism.boot.constructor;

public class Medal {
	  public String name;
	  public String type;
	  public String country;
	  public int goldCount;
	  public int silverCount;
	  public int bronzeCount;
	  public int year;
	  public boolean isSummer;
	  public boolean isWinter;
	  public int totalMedals;
	  public String mostSuccessfulAthlete;
	  public String mostSuccessfulSport;
	  public String hostCity;
	  public String hostCountry;
	  
	  public Medal(String n,String t,String c,int gC,int sC, int bC, int y,boolean iS,boolean iW,int tM,String mSA,String mSS,String hC,String hCy) {
		  name=n;
		  type=t;
		  country=c;
		  goldCount=gC;
		  silverCount=sC;
		  bronzeCount=bC;
		  year=y;
		  isSummer=iS;
		  isWinter=iW;
		  totalMedals=tM;
		  mostSuccessfulAthlete=mSA;
		  mostSuccessfulSport=mSS;
		  hostCity=hC;
		  hostCountry=hCy;
	  }
	  public void Display() {
		  System.out.println("Medal Event name "+name);
		  System.out.println("Medal Event type "+type);
		  System.out.println("Medal Event winning country "+country);
		  System.out.println("Medal Country gold count "+goldCount);
		  System.out.println("Medal Country silver count "+silverCount);
		  System.out.println("Medal Country bronze count "+bronzeCount);
		  System.out.println("Medal Event year "+year);
		  System.out.println("Medal Event is in Summer? "+isSummer);
		  System.out.println("Medal Event is in Winter? "+isWinter);
		  System.out.println("Medal winning country total medals "+totalMedals);
		  System.out.println("Country successfull athlete "+mostSuccessfulAthlete);
		  System.out.println("Country successfull sport "+mostSuccessfulSport);
		  System.out.println("Medal event host city "+hostCity);
		  System.out.println("Medal event host country "+hostCountry);
	  }
}
