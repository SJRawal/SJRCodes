package com.xworkz.polymorphism.boot.constructor;
import com.xworkz.polymorphism.dataCodes.constructor.Rainbow;
public class RainbowData {

	public static void main(String[] args) {
		Rainbow rainbow = new Rainbow("Red", true, "Yellow", 4, "Blue", "Indigo", "Violet");
		rainbow.DisplayRainbow();
	}

}
