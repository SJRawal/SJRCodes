package com.xworkz.polymorphism.boot.constructor;

import com.xworkz.polymorphism.dataCodes.constructor.Place;

public class PlaceData {

	public static void main(String[] args) {
		Place place = new Place();
		place.placeMethod("Davangere", 650065000l, "Davangere", "Karnataka", "India");
		place.showCity();
		Place place1 = new Place("South Mumbai", "Maharashtra");
		place1.placeMethod("Hubli", 550065000l, "Dharwad", "Karnataka", "India");
		place1.showCity();
		Place place2 = new Place("South Mumbai", 100065000l, "Mumbai", "Maharashtra", "India");
		place2.placeMethod("South Mumbai", 100065000l, "Mumbai", "Maharashtra", "India");
		place2.showCity();

	}

}
