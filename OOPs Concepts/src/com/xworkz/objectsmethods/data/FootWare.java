package com.xworkz.objectsmethods.data;

public class FootWare {
	private String brand;
	private int size;
	private boolean quality;

	public FootWare(String brand, int size, boolean quality) {
		this.brand = brand;
		this.size = size;
		this.quality = quality;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof FootWare) {
				System.out.println("obj is Foot ware type,can comapre");
				FootWare casted = (FootWare) obj;
				FootWare footWare = this;
				FootWare footWare2 = casted;
				if (footWare.brand.equals(footWare2.brand) & footWare.size == footWare2.size & footWare.quality == footWare.quality) {
					System.out.println("FootWare and FootWare2 is same");
					return true;
				} else {
					System.err.println("FootWare and FootWare2 not same");
				}
			} else {
				System.err.println("obj is not footWare,won't compare");
			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brand: "+this.brand+" Size: "+this.size+" Quality: "+this.quality;
	}
	
	
}
