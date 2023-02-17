package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

public class TubeBaloon extends Baloon{
		{	
		System.out.println("black soil class started");
		}
		@Override
		public void setExpanding() {
			System.out.println("Baloon is Expanding");
		}
		
		public float getsize() {
			return 5.5f;
		}
}
