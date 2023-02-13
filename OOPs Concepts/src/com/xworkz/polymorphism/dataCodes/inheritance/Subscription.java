package com.xworkz.polymorphism.dataCodes.inheritance;

import com.xworkz.polymorphism.dataCodes.constants.InternetSubs;

public class Subscription {
	
	public int duration;
	public double speed;
	public InternetSubs type;
	
	public void subs(int duration,double speed,InternetSubs type) {
		this.duration=duration;
		this.speed=speed;
		this.type=type;	
		
	}
	public void show() {
		System.out.println(this.duration);
		System.out.println(this.speed);
		System.out.println(this.type);
	}

}
