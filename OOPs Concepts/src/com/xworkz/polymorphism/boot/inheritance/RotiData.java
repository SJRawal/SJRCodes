package com.xworkz.polymorphism.boot.inheritance;

import com.xworkz.polymorphism.dataCodes.inheritance.method.ButterRoti;
import com.xworkz.polymorphism.dataCodes.inheritance.method.JowerRoti;
import com.xworkz.polymorphism.dataCodes.inheritance.method.Kulcha;
import com.xworkz.polymorphism.dataCodes.inheritance.method.Naan;
import com.xworkz.polymorphism.dataCodes.inheritance.method.OnionMasalaRagiRoti;
import com.xworkz.polymorphism.dataCodes.inheritance.method.OnionRagiRoti;
import com.xworkz.polymorphism.dataCodes.inheritance.method.RagiRoti;
import com.xworkz.polymorphism.dataCodes.inheritance.method.Roti;

public class RotiData {

	public static void main(String[] args) {

		OnionMasalaRagiRoti omrr = new OnionMasalaRagiRoti();
		omrr.setShape("Round");
		omrr.setCalories(500);
		omrr.setThickness(5);
		omrr.setWeight(101.52f);
		System.out.println("\n");

		OnionRagiRoti orr = new OnionMasalaRagiRoti();
		orr.setCalories(600);
		orr.setShape("Triangle");
		orr.setWeight(251.99f);
		OnionMasalaRagiRoti orr1 = (OnionMasalaRagiRoti) orr;
		orr1.setThickness(2);
		System.out.println("\n");

		RagiRoti rr = new OnionRagiRoti();
		rr.setCalories(500);
		rr.setShape("Circle");
		OnionRagiRoti rr1 = (OnionRagiRoti) rr;
		rr1.setWeight(230);
		RagiRoti rr2 = new OnionMasalaRagiRoti();
		OnionMasalaRagiRoti rr3 = (OnionMasalaRagiRoti) rr2;
		rr3.setThickness(3);
		System.out.println("\n");
		
		Roti roti = new RagiRoti();
		roti.setShape("Ovel");
		RagiRoti roti2 = (RagiRoti)roti;
		roti2.setCalories(200);
		Roti roti3 = new OnionRagiRoti();
		OnionRagiRoti roti4 = (OnionRagiRoti)roti3;
		roti4.setWeight(199.99f);
		Roti roti5 = new OnionMasalaRagiRoti();
		OnionMasalaRagiRoti roti6= (OnionMasalaRagiRoti)roti5 ;
		roti6.setThickness(4);
		System.out.println("\n");
		
		System.out.println("\n Another Roti chain started \n ");
		Kulcha kulcha = new Kulcha();
		kulcha.getLength(0);
		kulcha.getPrice(0);
		kulcha.setShape("Round");
		Naan naan = new Kulcha();
		Kulcha naan1 = (Kulcha)naan;
		ButterRoti butter = new ButterRoti();
		butter.getLength(0);
		butter.getPrice(0);
		butter.setShape(null);
		JowerRoti jower = new JowerRoti();
		jower.getPrice(0);
		jower.setShape(null);
		Roti roti7 = new JowerRoti();
		JowerRoti roti8 = (JowerRoti)roti7;
		
		System.out.println("\n Class Cast Exception showing \n ");
		
		
	}

}
