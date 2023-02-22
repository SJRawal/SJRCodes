package com.xworkz.objectsmethods.boot;

import com.xworkz.objectsmethods.data.WaterFall;

public class WaterFallData {
public static void main(String[] args) {
		
		WaterFall waterfall = new WaterFall("Jogfalls", 256, "Karnataka");
		WaterFall waterfall2 = new WaterFall("DudhSagar", 352, "Goa");
		System.out.println(waterfall.equals(waterfall2));
		System.out.println(waterfall.toString());
		WaterFall waterfall3 = new WaterFall("Jogfalls", 256, "Karnataka");
		System.out.println(waterfall.equals(waterfall3));
		
	}
}
