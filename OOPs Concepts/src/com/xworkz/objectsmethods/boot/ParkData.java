package com.xworkz.objectsmethods.boot;

import com.xworkz.objectsmethods.data.Park;

public class ParkData {

	public static void main(String[] args) {
		Park park = new Park("XYZ", "ABC", 1500, 2000, 90, 150);
		Park park2 = new Park("XYZ", "ABC", 1500, 2000, 90, 150);
		System.out.println(park.equals(park2));
	}

}
