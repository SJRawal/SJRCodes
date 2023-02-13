package com.xworkz.polymorphism.dataCodes.inheritance;

public class Company {
	  String name;
	  String ceoName;
	  int since;
	  Address address;
	  	

	  public Company(String name, String ceoName, int since,Address address) {
	    this.name = name;
	    this.ceoName = ceoName;
	    this.since = since;
	    this.address=address;

	  }
	  public void showCompany() {
		  address.showAddress();
		  System.out.println("\n Company class Started \n ");
		  System.out.println("Company name "+name);
		  System.out.println("Comapny CEO "+ceoName);
		  System.out.println("Comapny is established since "+since);
	  }

}
