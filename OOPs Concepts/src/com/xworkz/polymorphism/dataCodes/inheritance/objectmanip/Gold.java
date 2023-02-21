package com.xworkz.polymorphism.dataCodes.inheritance.objectmanip;

public class Gold {
	private String karat;
	private double weight;
	private double price;
	private String type;

	public void setKarat(String karat) {
		this.karat = karat;
	}

	public double getPrice() {
		return this.price;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public String toString() {
		System.out.println("Running toString for Gold class");
		return "Karat: " + this.karat + " Weight " + this.weight + " Price " + this.price + " Type " + this.type;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 5678;
	}
}
