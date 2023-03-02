package com.xworkz.polymorphism.dataCodes.inheritance.method;

public final class HarryPotter {
	private final String author="J K Rowling";
	private int totalMovies;
	private String hero;
	private String villian;
	private boolean popular;
	
	public HarryPotter(int totalMovies, String hero, String villian, boolean popular) {
		this.totalMovies = totalMovies;
		this.hero = hero;
		this.villian = villian;
		this.popular = popular;
	}

	@Override
	public String toString() {
		return "HarryPotter [Author=" + author + ", Total Movies=" + totalMovies + ", Hero=" + hero + ", Villian="
				+ villian + ", Popular=" + popular + "]";
	}
	

}
