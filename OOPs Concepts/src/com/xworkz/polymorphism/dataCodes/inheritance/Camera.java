package com.xworkz.polymorphism.dataCodes.inheritance;

public class Camera {
	public int pixel;
	public int noOfCamera;
	public boolean goodCamera;

	public void init(int pixel, int noOfCamera, boolean goodCamera) {
		this.pixel = pixel;
		this.noOfCamera = noOfCamera;
		this.goodCamera = goodCamera;
	}

	public void openCamera() {
		System.out.println("\n-----------");
		System.out.println("My camera has pixel of " + pixel);
		System.out.println("My phone camera has " + noOfCamera);
		System.out.println("My phone camera has good quality " + goodCamera);
	}
}
