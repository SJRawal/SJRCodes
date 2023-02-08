package com.xworkz.polymorphism.dataCodes.inheritance;

public class Isro {
	public String[] locations;
	public int[] satelliteNos;
	public Scientist[] scientist;
	
	public void setlocations(String[] locations) {
		this.locations=locations;
	}
	public void setsatelliteNos(int[] satelliteNos) {
		this.satelliteNos=satelliteNos;
	}
	
	public void setScientist(Scientist[] scientist) {
		this.scientist = scientist;
	}
	
	public void show() {
		if(this.locations!=null) {
			for(int count=0;count<this.locations.length;count++) {
				String elements = this.locations[count];
				System.out.println("ISRO Locations "+elements+" at index "+count);
			}
		}
		else {
			System.err.println("These locations are nulll");
		}
		if(this.satelliteNos!=null) {
			for(int count=0;count<this.satelliteNos.length;count++) {
				int elements = this.satelliteNos[count];
				System.out.println("ISRO Satellite numbers "+elements+" at index "+count);
			}
		}
		else {
			System.err.println("This Satellite is nulll");
		}
		if (this.scientist != null) {
			for (int count = 0; count < this.scientist.length; count++) {
				Scientist elements = this.scientist[count];
				elements.show1();
			}
		} else {
			System.err.println("This Satellite is nulll");
		}
		
	}

}
