package com.xworkz.abstraction.data;

public class Flying extends AbstractInformation implements PassportRule,DubaiVisaRule,Developer{

	@Override
	public String followsStandards() {
		System.out.println("Traveller should follow Dubai country rules");
		return "Rules given by country should be followed";
	}

	@Override
	public boolean understandingConcept() {
		System.out.println("0 understanding of the concept and don't know the reason behind this task");
		return true;
	}

	@Override
	public int minAmount() {
		System.out.println("Minimum flight charges from India to Dubai");
		return 9517;
	}

	@Override
	public boolean stayingHotel() {
		System.out.println("Traveller stayed in Hotel");
		return false;
	}

	@Override
	public int maxGoldLimit() {
		System.out.println("Traveller can only bring gms of: ");
		return 20;
	}

	@Override
	public String citizen() {
		System.out.println("To get visa to dubai from India he should have: ");
		return "Indian Citizenship with Indian passport";
	}

	@Override
	public int criminalRecords() {
		System.out.println("Person to have a psssport should have total criminal records of: ");
		return 0;
	}

	@Override
	public boolean jail() {
		System.out.println("Traveller went to Jail: ");
		return false;
	}

}
