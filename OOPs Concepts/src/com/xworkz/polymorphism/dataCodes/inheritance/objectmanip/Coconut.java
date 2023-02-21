package com.xworkz.polymorphism.dataCodes.inheritance.objectmanip;

public class Coconut {
	private int price;
	private String location;
	private boolean sweet;
	private String size;

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void isSweet(boolean sweet) {
		this.sweet = sweet;
	}

	@Override
	public String toString() {
		System.out.println("Running to String method for Coconut class");
		return "Price: " + this.price + " Location: " + this.location + " Size: " + this.size + " Sweet: " + this.sweet;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 143;
	}
}
