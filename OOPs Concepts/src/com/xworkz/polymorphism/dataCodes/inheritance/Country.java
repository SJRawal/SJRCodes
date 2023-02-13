package com.xworkz.polymorphism.dataCodes.inheritance;

public class Country {
	  String name;
	  String president;
	  boolean developed;
	  State state;

	  public Country(String name, String president, boolean developed,State state) {
	    this.name = name;
	    this.president = president;
	    this.developed = developed;
	    this.state=state;
	  }
	  public void showCountry() {
		  state.showState();
		  System.out.println("\n Country class started \n");
		  System.out.println("Country name is "+name);
		  System.out.println("Country's President name "+president);
		  System.out.println("Is the country developed? "+developed);
	  }

}
