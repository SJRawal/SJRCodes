package com.xworkz.polymorphism.dataCodes.inheritance.objectmanip;

public class Pipe {
	private String material;
	private double diameter;
	private double length;
	private String brand;

	public String getMaterial() {
		return this.material;
	}

	public double getDiameter() {
		return this.diameter;
	}

	public double getLength() {
		return this.length;
	}

	public String getBrand() {
		return this.brand;
	}

	@Override
	public String toString() {
		System.out.println("Running toString for Pipe");
		return "Material " + this.material + " Diameter " + this.diameter + " Length " + this.length + " Brand "
				+ this.brand;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1234;
	}
}
