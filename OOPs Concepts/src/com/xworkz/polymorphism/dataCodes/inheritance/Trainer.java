package com.xworkz.polymorphism.dataCodes.inheritance;

public class Trainer {
	public int trainers;
	public String teach;
	public boolean goodTeaching;

	public void init1(int trainers, String teach, boolean goodTeaching) {
		this.trainers = trainers;
		this.teach = teach;
		this.goodTeaching = goodTeaching;
	}

	public void showTrainer() {
		System.out.println("\n-----------");
		System.out.println("Xworkz has how many trainers: " + trainers);
		System.out.println("Xworkz has been teaching: " + teach);
		System.out.println("Xworkz has good teaching " + goodTeaching);
	}
}
