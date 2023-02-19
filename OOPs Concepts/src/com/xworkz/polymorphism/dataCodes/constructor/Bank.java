package com.xworkz.polymorphism.dataCodes.constructor;

public class Bank {
	public String name;
	public long accountNumber;
	public float amount;
	public String location;
	public String bankName;
	
	public Bank(String name) {
		this.name=name;
		System.out.println("Name of the Account Holder "+name);
	}
	public Bank(String name,long accountNumber) {
		this(name);
		this.accountNumber=accountNumber;
		
		System.out.println("Account number of the account holder "+accountNumber);
	}
	public Bank(String name,long accountNumber,float amount) {
		this(name,accountNumber);
		this.amount=amount;
		System.out.println("Amount in account "+amount);
	}
	public Bank(String name,long accountNumber,float amount,String location) {
		this(name,accountNumber,amount);
		this.location=location;
		System.out.println("Location of the Bank "+location);
	}
	public Bank(String name,long accountNumber,float amount,String location,String bankName) {
		this(name,accountNumber,amount,location);
		this.bankName=bankName;
		System.out.println("Account holder Bank Name "+bankName);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank("XYZ");
		Bank bank1 = new Bank("XYZ",123456789103l);
		Bank bank2 = new Bank("XYZ",123456789103l,54000.58f);
		Bank bank3 = new Bank("XYZ",123456789103l,54000.58f,"DVG");
		Bank bank4 = new Bank("XYZ",123456789103l,54000.58f,"DVG","Kotak Bank");
	}

}
