package com.xworkz.polymorphism.dataCodes.constructor;

public class Place {
	public String name;
	public long population;
	public String district;
	public String state;
	public String country;

	public Place() {
		System.out.println("Place Constructor without arguments");
	}

	public Place(String name, String state) {
		this.name = name;
		this.state = state;
		System.out.println("\n Place constructor with 2 arguments");

	}

	public Place(String district, long population, String country, String name, String state) {
		this(name, state);
		System.out.println("\n Place constructor with 3 arguments namely : district,Population and Country ");
	}

	public void placeMethod(String name, long population, String district, String state, String country) {

	}

	public void showCity() {
		System.out.println("Place Name " + name);
		System.out.println("Place population " + population);
		System.out.println("Place district " + district);
		System.out.println("Place state " + state);
		System.out.println("Place country " + country);
	}
}
