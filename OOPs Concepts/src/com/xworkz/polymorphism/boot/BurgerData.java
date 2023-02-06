package com.xworkz.polymorphism.boot;
import com.xworkz.polymorphism.dataCodes.constructor.Burger;
public class BurgerData {

	public static void main(String[] args) {
		Burger burger = new Burger("Chicken Burger ", true, 255.89f, 5, 100, 0.5f, "American", true, "Spicy Barbeque", "Whole WHeat", "Morzarella", false, 2, 1, 0);
		burger.showBurger();
	}

}
