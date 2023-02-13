package com.xworkz.polymorphism.dataCodes.inheritance;

public class Security {
	String deptName;
    int totalStaff;
    int headStaff;
    Company company;
    
    public Security(String deptName,int totalStaff,int headStaff,Company company) {
    	this.deptName=deptName;
    	this.totalStaff=totalStaff;
    	this.headStaff=headStaff;
    	this.company=company;
    }
    public void showSecurity() {
    	company.showCompany();
    	System.out.println("\n Security class Started \n ");
    	System.out.println("Security Comapny Name "+deptName);
    	System.out.println("Security company total Staff "+totalStaff);
    	System.out.println("Security company total head staff "+headStaff);
    }
    

}
