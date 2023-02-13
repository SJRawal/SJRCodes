package com.xworkz.polymorphism.dataCodes.inheritance;

public class Plan {
	
	public double price = 450D;
	public String name;
	public Subscription sub;
	
	public Plan(String name) {
		this.name=name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setName(String name) {
		this.name=name;
	}
	

}
