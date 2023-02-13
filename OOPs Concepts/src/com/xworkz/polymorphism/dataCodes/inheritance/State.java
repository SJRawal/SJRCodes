package com.xworkz.polymorphism.dataCodes.inheritance;

public class State {
	  String name;
	  String cmName;
	  String language;
	  City city;

	  public State(String name, String cmName, String language, City city) {
	    this.name = name;
	    this.cmName = cmName;
	    this.language = language;
	    this.city = city;
	  }
	  public void showState() {
		city.showCity();
		System.out.println("\n State class started \n");
		System.out.println("State Name "+name);
		System.out.println("State CM name "+cmName);
		System.out.println("Language speaking in the State "+language);
	  }
	  

}
