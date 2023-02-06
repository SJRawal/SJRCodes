package com.xworkz.polymorphism.boot.constructor;
import com.xworkz.polymorphism.dataCodes.constructor.Fan;
public class FanData {

	public static void main(String[] args) {
		Fan rotate = new Fan();
		
		rotate.brand="Usha";
		rotate.price=2800.99f;
		rotate.warrenty=2;

		System.out.println("Fan brand is "+rotate.brand);
		System.out.println("Fan price is "+rotate.price);
		System.out.println("Fan warrenty is "+rotate.warrenty);
		
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-");
		rotate.brand="Rally";
		rotate.price=2500.5f;
		rotate.warrenty=5;

		System.out.println("Fan brand is "+rotate.brand);
		System.out.println("Fan price is "+rotate.price);
		System.out.println("Fan warrenty is "+rotate.warrenty);
	}

}
