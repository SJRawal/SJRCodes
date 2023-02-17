package com.xworkz.polymorphism.boot.inheritance;

import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.Baloon;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.BengalTiger;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.Clock;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.Garland;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.LedTubelight;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.RedSoil;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.RoseGarland;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.Soil;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.Tiger;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.TubeBaloon;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.Tubelight;
import com.xworkz.polymorphism.dataCodes.inheritance.method.overriding.WallClock;

public class OverrideData {

	public static void main(String[] args) {
		Soil soil = new Soil();
		soil.setMoisture(null);
		
		Soil soil1 = new RedSoil();
		soil1.setMoisture("wet");
		
		System.out.println("\n Soil class with inheritance ended \n ");
		
		Baloon baloon = new Baloon();
		baloon.setExpanding();
		
		Baloon tube = new TubeBaloon();
		tube.setExpanding();
		
		Baloon baloon1 = new Baloon();
		float size = baloon1.getsize();
		System.out.println(size);
		Baloon tube1 = new TubeBaloon();
		float size1 = tube1.getsize();
		System.out.println(size1);
		System.out.println("\n Clock class with inheritance ended \n ");
		
		Clock clock = new Clock();
		clock.setTicking();
		WallClock wall = new WallClock();
		wall.setTicking();
		System.out.println("\n Clock class with inheritance ended \n ");
		
		Garland garland = new Garland();
		String flowers1=garland.getFlowers();
		System.out.println(flowers1);
		RoseGarland garland1 = new RoseGarland();
		String flowers2=garland.getFlowers();
		System.out.println(flowers2);
		
		Garland rose = new Garland();
		boolean fresh=garland.isFresh();		
		System.out.println(fresh);
		RoseGarland rose1 = new RoseGarland();
		boolean fresh1=garland.isFresh();		
		System.out.println(fresh1);
		
		System.out.println("\n Garland class with inheritance ended \n ");
		
		Tiger tiger = new Tiger();
		tiger.setAge(25);
		BengalTiger bengal = new BengalTiger();
		bengal.setAge(35);
		
		System.out.println("\n Tiger class with inheritance ended \n ");
		
		Tubelight tubelight = new Tubelight();
		tubelight.setGood(false);
		Tubelight tubelight1 = new LedTubelight();
		tubelight1.setGood(true);
		
		System.out.println("\n Tubelight class with inheritance ended \n ");
	}

}
