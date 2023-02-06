package com.xworkz.polymorphism.dataCodes.inheritance;

public class Phone {
	public int memory;
	public String brand;
	public boolean operatingSystem;
	public Camera cam = new Camera();

	public void init(int memory, String brand, boolean operatingSystem) {
		this.memory = memory;
		this.brand = brand;
		this.operatingSystem = operatingSystem;
	}

	public void openMobile() {
		System.out.println("\nPhone has Camera");
		System.out.println("My phone has a memory of " + memory);
		System.out.println("My phone has a brand of " + brand);
		System.out.println("My phone has an operating System " + operatingSystem);
		this.cam.openCamera();
	}
}
