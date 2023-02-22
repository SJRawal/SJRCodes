package com.xworkz.objectsmethods.data;

public class Tv {
	public String brand;
	public int price;
	public float size;

	public Tv(String brand, int price, float size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Tv) {
				System.out.println("obj is Tv type,can comapre");
				Tv casted = (Tv) obj;
				Tv tv = this;
				Tv tv2 = casted;
				if (tv.brand.equals(tv2.brand) & tv.price == tv2.price & tv.size == tv.size) {
					System.out.println("Tv and Tv2 is same");
					return true;
				} else {
					System.err.println("Tv and Tv2 not same");
				}
			} else {
				System.err.println("obj is not tv,won't compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brand: "+this.brand+" Price: "+this.price+" Size: "+this.size;
	}

}
