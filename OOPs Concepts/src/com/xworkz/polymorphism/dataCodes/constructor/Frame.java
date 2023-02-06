package com.xworkz.polymorphism.dataCodes.constructor;

public class Frame {
    String material;
    String color;
    String shape;
    int size;
    int weight;
    String style;
    String finish;
    String durability;
    int price;
    String brand;
    String type;
    int warranty;
    
    public Frame(String material,String color,String shape,int size,int weight,String style,String finish,String durability,int price,String brand,String type,int warranty) {
        this.material=material;
        this.color=color;
        this.shape=shape;
        this.size=size;
        this.weight=weight;
        this.style=style;
        this.finish=finish;
        this.durability=durability;
        this.price=price;
        this.brand=brand;
        this.type=type;
        this.warranty=warranty;
    	
    }
    
    public void showFrame() {
    	System.out.println("Frame material "+this.material);
    	System.out.println("Frame color "+this.color);
    	System.out.println("Frame shape "+this.shape);
    	System.out.println("Frame size "+this.size+" inch");
    	System.out.println("Frame weight "+this.weight+" gms");
    	System.out.println("Frame style "+this.style);
    	System.out.println("Frame finish "+this.finish);
    	System.out.println("Frame durability "+this.durability);
    	System.out.println("Frame price "+this.price+" Rupees");
    	System.out.println("Frame brand "+this.brand);
    	System.out.println("Frame type "+this.type);
    	System.out.println("Frame warranty "+this.warranty+" year");
    	
    }

}
