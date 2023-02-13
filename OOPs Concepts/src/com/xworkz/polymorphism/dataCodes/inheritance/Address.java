package com.xworkz.polymorphism.dataCodes.inheritance;

public class Address {
	 Country country;

	  public Address(Country country) {
	    this.country = country;
	  }
	  public void showAddress() {
		  country.showCountry();
		  System.out.println("\n Address class Started \n ");
	  }
	  

}
