package com.xworkz.polymorphism.dataCodes.inheritance;

public class City {
	String name,district,capital;
	Area area;
		
	
	public City(String name,String district,String capital, Area area) {
		this.name=name;
		this.district=district;
		this.capital=capital;
		this.area=area;
	}
	
	
	
	
	
	
	public void showCity() {
		
		area.showArea();
		System.out.println("\n City class started \n");
		System.out.println("City name "+name);
		System.out.println("District name "+district);
		System.out.println("Capital of the City "+capital);
	}

}
