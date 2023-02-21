package com.xworkz.polymorphism.boot.objectboot;

import com.xworkz.polymorphism.dataCodes.inheritance.objectmanip.Door;

public class DoorData {

	public static void main(String[] args) {
		Door door = new Door();
		door.setMaterial("Wood");
		door.setHeight(15);
		door.setOpen(true);
		door.setWidth(5);
		System.out.println(door);
		
		Door door2 = new Door();
		door2.setMaterial("Wood");
		door2.setHeight(15);
		door2.setOpen(true);
		door2.setWidth(5);
		System.out.println(door2);
		
		System.out.println(door.hashCode() + " Original hashCode: " + System.identityHashCode(door));
		System.out.println("Before manipulation " + door.equals(door2));
		door = door2;
		System.out.println("After Manipulation " + door.equals(door2));
	}

}
