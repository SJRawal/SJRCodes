package com.xworkz.objectsmethods.data;

public class Fish {
	private String name;
	private int weight;
	private boolean eatable;
	private String color;
	private int size;

	public Fish(String name, int weight, boolean eatable, String color, int size) {
		this.name = name;
		this.weight = weight;
		this.eatable = eatable;
		this.color = color;
		this.size = size;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Fish) {
				System.out.println("obj is Fish type,can comapre");
				Fish casted = (Fish) obj;
				Fish fish = this;
				Fish fish2 = casted;
				if (fish.name.equals(fish2.name) && fish.weight == fish2.weight && fish.eatable == fish2.eatable
						&& fish.color.equals(fish2.color) && fish.size == fish2.size) {
					return true;

				} else {
					System.err.println("Fish and Fish2 not same");
				}
			} else {
				System.err.println("Fish and Fish2 won't compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fish name: " + this.name + " Weight: " + this.weight + " Eatable: " + this.eatable + " Color: "
				+ this.color + " Size: " + this.size;
	}
}
