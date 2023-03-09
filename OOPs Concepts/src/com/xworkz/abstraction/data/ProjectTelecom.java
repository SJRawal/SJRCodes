package com.xworkz.abstraction.data;

public class ProjectTelecom extends Project{

	@Override
	public String branch() {
		return "Wireless Communication Project";
	}

	@Override
	public int duration() {
		return 5;
	}

	@Override
	public boolean done() {
		return true;
	}
	

}
