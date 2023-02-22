package com.xworkz.objectsmethods.boot;

import com.xworkz.objectsmethods.data.Fish;

public class FishData {

	public static void main(String[] args) {
		Fish fish = new Fish("Surma", 5000, true, "Blue", 2);
		Fish fish2 = new Fish("gold", 50, false, "yello", 1);
		System.out.println(fish.equals(fish2));
		Fish fish3 = new Fish("Surma", 5000, true, "Blue", 2);
		System.out.println(fish.equals(fish3));
	}

}
