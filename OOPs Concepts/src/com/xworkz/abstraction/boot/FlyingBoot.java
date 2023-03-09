package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.data.Flying;

public class FlyingBoot {

	public static void main(String[] args) {
		Flying fly = new Flying();
		System.out.println(fly);
		
		System.out.println(fly.citizen());
		System.out.println(fly.criminalRecords());
		System.out.println(fly.followsStandards());
		System.out.println(fly.jail());
		System.out.println(fly.maxGoldLimit());
		System.out.println(fly.minAmount());
		System.out.println(fly.stayingHotel());
		System.out.println(fly.understandingConcept());
		System.out.println(fly.followsStandards());
	}

}
