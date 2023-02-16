package com.xworkz.polymorphism.dataCodes.inheritance.method;

public class Camera extends Device {
	private String brand;
	int series;

	public void setBrand(String brand,String type) {
		super.setType("Digital Camera");
		this.brand = brand;
		System.out.println(type+" is of "+brand);
	}

	public void setSeries(int series) {
		this.series = series;
		System.out.println("Series of that camera is "+series);
	}

	public Camera() {
		System.out.println("no argument constructor");
	}

}
