package com.xworkz.polymorphism.dataCodes.inheritance.objectmanip;

public class Adike {
	private String variety;
	private double price;
	private int quantity;
	private boolean qualityGood;

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public void setQualityGood(boolean qualityGood) {
		this.qualityGood = qualityGood;
	}

	@Override
	public String toString() {
		System.out.println("Running toString for Adike");
		return "Varity " + this.variety + " Price " + this.price + " Quantity " + this.quantity + " Nut good quality "
				+ this.qualityGood;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1432;
	}
}
