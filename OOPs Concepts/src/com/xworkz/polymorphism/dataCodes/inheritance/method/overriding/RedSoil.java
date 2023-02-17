package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

public class RedSoil extends Soil{
		{	
		System.out.println("black soil class started");
		}
		@Override
		public void setMoisture(String moisture) {
			System.out.println("Moisture of the soil " + moisture);
		}
		
		public float getHeight() {
			return 11.5f;
		}

}
