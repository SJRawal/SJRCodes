package com.xworkz.polymorphism.boot;

public class Box {
		public static float store(double money, String mobile) {
			System.out.println("Total Amount of Money "+money+" can buy me "+mobile);
			return 0.0f;
			
		}
		public static String store(String bangle) {
			System.out.println("Shape of bangle is "+bangle);
			return "No Shape";
			
		}
		public static String store(String powder, String cream) {
			System.out.println("Makeup with "+powder+" and "+cream);
			return "No Makeup";
			
		}
		public static String store(int charger, String mobile) {
			System.out.println("This device has "+charger+" and this is from "+mobile+" company");
			return "Mobile Gone";
		}
		public static String store(int money, int pendrive, int card) {
			System.out.println("For this much of "+money+" money we can only get "+pendrive+" pendrive and memory card of"+card);
			return "Less Money";
		}
}
