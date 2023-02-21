package com.xworkz.polymorphism.boot.objectboot;

import com.xworkz.polymorphism.dataCodes.inheritance.objectmanip.Paint;

public class PaintData {

	public static void main(String[] args) {
		Paint paint = new Paint();

		paint.setName(" Monalisa ");
		paint.setPainter("Leonardo Da Vinci");
		paint.setYear(1506);
		paint.setPrice(71246743000l);

		Paint paint2 = new Paint();

		paint2.setName(" Doni Tondo ");
		paint2.setPainter("Michelangelo");
		paint2.setYear(1507);
		paint2.setPrice(13945753);

		System.out.println(paint);
		System.out.println(paint2);
		System.out.println(paint.hashCode() + " Original hashCode: " + System.identityHashCode(paint));
		System.out.println("Before manipulation " + paint.equals(paint2));
		paint = paint2;
		System.out.println("After Manipulation " + paint.equals(paint2));
	}

}
