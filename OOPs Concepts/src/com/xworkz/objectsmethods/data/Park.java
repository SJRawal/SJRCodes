package com.xworkz.objectsmethods.data;

public class Park {
	private String name;
	private String location;
	private float area;
	private int numTrees;
	private float ratting;
	private int ticketPrice;

	public Park(String name, String location, float area, int numTrees, float ratting, int ticketPrice) {
		this.name = name;
		this.location = location;
		this.area = area;
		this.numTrees = numTrees;
		this.ratting = ratting;
		this.ticketPrice = ticketPrice;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Tv) {
				System.out.println("obj is Park type,can comapre");
				Park casted = (Park) obj;
				Park park = this;
				Park park2 = casted;
				if (park.name.equals(park2.name) && park.location.equals(park2.location) && park.area == park2.area
						&& park.numTrees == park2.numTrees && park.ratting == park2.ratting
						&& park.ticketPrice == park2.ticketPrice) {
					System.out.println("Park and Park2 is same");
					return true;
				} else {
					System.err.println("Park and Park2 not same");
				}
			} else {
				System.err.println("obj is not park,won't compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
