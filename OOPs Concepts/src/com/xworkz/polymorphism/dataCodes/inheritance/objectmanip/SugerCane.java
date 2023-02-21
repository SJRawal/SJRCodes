package com.xworkz.polymorphism.dataCodes.inheritance.objectmanip;

public class SugerCane {
	private String variety;
	private double length;
	private boolean isMature;
	private boolean isSweet;

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setMature(boolean isMature) {
		this.isMature = isMature;
	}

	public void setSweet(boolean isSweet) {
		this.isSweet = isSweet;
	}

	@Override
	public String toString() {
		System.out.println("Running toString for Door class");
		return "Varity: " + this.variety + " Length: " + this.length + " is Mature: " + this.isMature + " is Sweet: "
				+ this.isSweet;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1569;
	}
}
