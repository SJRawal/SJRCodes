package com.xworkz.polymorphism.dataCodes.inheritance;

public class Mall {
	String name;
	boolean goodAmbience;
	int totalFloors;
	Security security;
	
	
	
	public Mall(String name,boolean goodAmbience,int totalFloors,Security security) {
		this.name=name;
		this.goodAmbience=goodAmbience;
		this.totalFloors=totalFloors;
		this.security=security;
	}
	
	public void showMall() {
		security.showSecurity();
		System.out.println("\n Mall class Started \n ");
		System.out.println("Mall name "+name);
		System.out.println("Mall total Floors "+totalFloors);
		System.out.println("Mall Ambience is good "+goodAmbience);
	}

}
