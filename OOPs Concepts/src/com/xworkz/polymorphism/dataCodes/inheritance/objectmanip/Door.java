package com.xworkz.polymorphism.dataCodes.inheritance.objectmanip;

public class Door {
	private String material;
	private int width;
	private int height;
	private boolean isOpen;

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	@Override
	public String toString() {
		System.out.println("Running toString for Door class");
		return "Material: " + this.material + " Width: " + this.width + " Height: " + this.height + " Door Open: "
				+ this.isOpen;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10203040;
	}
}
