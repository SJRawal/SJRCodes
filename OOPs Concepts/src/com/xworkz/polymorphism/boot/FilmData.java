package com.xworkz.polymorphism.boot;
import com.xworkz.polymorphism.dataCodes.Film;
public class FilmData {

	public static void main(String[] args) {
	Film picture = new Film();
	
	picture.name="Avatar: The Way of Water";
	picture.duration=192;
	picture.ticketCost=267.18f;
	picture.budget=20375087500l;
	picture.director="James Cameron";
	System.out.println("Film name is "+picture.name);
	System.out.println("Film duration is "+picture.duration+" minutes");
	System.out.println("Film ticket cost is "+picture.ticketCost);
	System.out.println("Film budget is "+picture.budget);
	System.out.println("Film director is "+picture.director);
	
	System.out.println("+=+=+=+=+=+=+=+=+");
	picture.name="Avatar";
	picture.duration=162;
	picture.ticketCost=157.5f;
	picture.budget=19312193850l;
	picture.director="James Cameron";
	System.out.println("Film name is "+picture.name);
	System.out.println("Film duration is "+picture.duration+" minutes");
	System.out.println("Film ticket cost is "+picture.ticketCost);
	System.out.println("Film budget is "+picture.budget);
	System.out.println("Film director is "+picture.director);
	}

}
