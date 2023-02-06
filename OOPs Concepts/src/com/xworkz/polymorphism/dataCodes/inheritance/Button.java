package com.xworkz.polymorphism.dataCodes.inheritance;

public class Button {
	public String color, size, type;

	public void initMethod(String color, String size, String type) {
		this.color = color;
		this.size = size;
		this.type = type;
	}

	public void showButton() {
		System.out.println("\n-----------");
		System.out.println("Button has different color " + color);
		System.out.println("Button has different size" + size);
		System.out.println("Button has different type " + type);
	}
}
