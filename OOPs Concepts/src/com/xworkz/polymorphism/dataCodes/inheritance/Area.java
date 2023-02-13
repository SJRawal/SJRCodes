package com.xworkz.polymorphism.dataCodes.inheritance;

public class Area {
	
	public String name;
	public int population;
	public String street;
	
	public Area(String name,int population,String street) {
		this.name=name;
		this.population=population;
		this.street=street;
	}
	public void showArea() {
		System.out.println("Area Class started \n ");
		System.out.println("Name of the City "+name);
		System.out.println("Total population of the city "+population);
        System.out.println("Street name of the city "+street);
	}

}
