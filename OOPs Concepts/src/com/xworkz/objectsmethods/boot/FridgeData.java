package com.xworkz.objectsmethods.boot;

import com.xworkz.objectsmethods.data.Fridge;

public class FridgeData {

	public static void main(String[] args) {
		Fridge fridge = new Fridge(25, 500, 4, true, false, true, "5 Star", "LG", "2023 New", "Blue", 15000, 5);
		Fridge fridge2 = new Fridge(25, 500, 4, true, false, true, "5 Star", "LG", "2023 New", "Blue", 15000, 5);
		System.out.println(fridge.equals(fridge2));
	}

}
