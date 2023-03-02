package com.xworkz.polymorphism.dataCodes.inheritance.method;

public class HarryPotterBook {

	private String heroine;
	private int totalBooks;
	private int yop;
	
	
	public final String getHeroine() {
		return "Hermione Granger";
	}
	public final void setHeroine(String heroine) {
		this.heroine=heroine;
	}
	
	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "HarryPotterBook [Heroine=" + heroine + ", Total Books=" + totalBooks + ", Year of Publish=" + yop + "]";
	}
	

}
