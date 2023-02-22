package com.xworkz.objectsmethods.data;

public class Fridge {
	private float temperature;
	private int capacity;
	private int compartments;
	private boolean door;
	private boolean freezer;
	private boolean defrost_cycle;
	private String energy_rating;
	private String brand;
	private String model;
	private String color;
	private double price;
	private int warrenty;

	public Fridge(float temperature, int capacity, int compartments, boolean door, boolean freezer,
			boolean defrost_cycle,String energy_rating, String brand, String model, String color, double price,
			int warrenty) {
		this.temperature=temperature;
		this.capacity=capacity;
		this.compartments=compartments;
		this.door=door;
		this.freezer=freezer;
		this.defrost_cycle=defrost_cycle;
		this.energy_rating=energy_rating;
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
		this.warrenty=warrenty;

	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Fridge) {
				System.out.println("obj is Fridge type,can comapre");
				Fridge casted = (Fridge)obj;
				Fridge fridge = this;
				Fridge fridge2 = casted;
				if(fridge.temperature==fridge2.temperature && fridge.capacity==fridge2.capacity && fridge.compartments==fridge2.compartments && fridge.door==fridge2.door && fridge.freezer==fridge2.freezer && fridge.defrost_cycle==fridge2.defrost_cycle && fridge.energy_rating.equals(fridge2.energy_rating) && fridge.brand.equals(fridge2.brand) && fridge.model.equals(fridge2.model) && fridge.color.equals(fridge2.color) && fridge.price==fridge2.price && fridge.warrenty==fridge2.warrenty) {
					System.out.println("Fridge and Fridge 2 are same");
					return true;
					
				}else {
					System.err.println("Fridge and Fridge 2 not same");
				}
				
		}else {
			System.err.println("obj is not fridge,won't compare");
		}
		
	}else {
		System.err.println("Object is null");
	}return super.equals(obj);
	}
}
