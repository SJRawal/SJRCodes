package com.xworkz.polymorphism.dataCodes.inheritance;

public class Scientist {
	public String scientists;
	public String designations;

	public void setScientists(String scientists) {
		this.scientists = scientists;
	}

	public void setDesignations(String designations) {
		this.designations = designations;
	}

	public void show1() {
		System.out.println(this.scientists);
		System.out.println(this.designations);
	}

}
