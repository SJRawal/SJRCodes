package com.xworkz.polymorphism.dataCodes.inheritance;

public class Shirt {
	public String color;
	public char size;
	public String type;
	public Button button = new Button();

	public void initMethod(String color, char size, String type) {
		this.color = color;
		this.size = size;
		this.type = type;
	}

	public void showShirt() {
		System.out.println("\nShirt has Button");
		System.out.println("Shirt has different color " + color);
		System.out.println("Shirt has different size(S,M,L) " + size);
		System.out.println("Shirt has different type " + type);
		this.button.showButton();
	}
}
