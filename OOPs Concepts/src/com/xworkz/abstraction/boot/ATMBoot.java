package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.data.ATM;
import com.xworkz.abstraction.data.ATMBank;

public class ATMBoot {

	public static void main(String[] args) {
		ATM atm = new ATMBank();
		ATMBank atm1 = (ATMBank)atm;
		System.out.println("Account Holder Name: "+atm1.accountHolderName());
		System.out.println("Account Number: "+atm1.accountNumber());
		System.out.println("Account type changed to: "+atm1.changeAccountType());
		System.out.println("Account Balance: "+atm1.checkBalance());
		System.out.println("Account closeing: "+atm1.closeAccount());
		System.out.println("Amount Deposited: "+atm1.deposit());
		System.out.println(atm1.miniStatement());
		System.out.println("ATM pin: "+atm1.pinATM());
		System.out.println("Amount Transferred: "+atm1.transferAmount());
		System.out.println("Amount Withdrawn: "+atm1.withdraw());
	}

}
