package com.xworkz.polymorphism.dataCodes.inheritance;

public class Xworkz {

	public int trainees;
	public String location;
	public boolean closed;
	public Trainer trainer = new Trainer();

	public void init(int trainees, String location, boolean closed) {
		this.trainees = trainees;
		this.location = location;
		this.closed = closed;
	}

	public void showXworkz() {
		System.out.println("Xworkz has Trainer");
		System.out.println("Xworkz has how many trainees: " + trainees);
		System.out.println("Xworkz has one location in: " + location);
		System.out.println("Xworkz has been closed " + closed);
		this.trainer.showTrainer();
	}
}
