package com.xworkz.polymorphism.dataCodes.constructor;

public class Rainbow {
	public String color1;
    public boolean orange;
    public String color3;
    public int green;
    public String color5;
    public String color6;
    public String color7;
    
    public Rainbow(String color1, boolean orange,String color3, int green,String color5,String color6,String color7) {
    	this.color1=color1;
    	this.orange=orange;
    	this.color3=color3;
    	this.green=green;
    	this.color5=color5;
    	this.color6=color6;
    	this.color7=color7;
    			
    	
    }
    
    public void DisplayRainbow() {
    	System.out.println("Rainbow color 1 "+this.color1);
    	System.out.println("Rainbow 2nd color orange? "+this.orange);
    	System.out.println("Rainbow color 3 "+this.color3);
    	System.out.println("Rainbow green color position "+this.green);
    	System.out.println("Rainbow color 5 "+this.color5);
    	System.out.println("Rainbow color 6 "+this.color6);
    	System.out.println("Rainbow color 7 "+this.color7);
    }

}
