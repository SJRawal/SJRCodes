package com.xworkz.polymorphism.dataCodes;
import com.xworkz.polymorphism.boot.Box;
import com.xworkz.polymorphism.boot.Person;
public class PersonData {

	public static void main(String[] args) {
		Box.store(30000.99,"OnePlus");
		Person.buy("Biryani", 1000);
		Person.buy("College Bag", "Rolex");
		Person.buy("Suit", 9, "Leather");

	}

}
