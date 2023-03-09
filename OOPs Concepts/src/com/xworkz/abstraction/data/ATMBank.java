package com.xworkz.abstraction.data;

public class ATMBank extends ATM{

	@Override
	public boolean deposit() {
		return false;
	}

	@Override
	public boolean withdraw() {
		return true;
	}

	@Override
	public float checkBalance() {
		return 99999.99f;
	}

	@Override
	public int pinATM() {
		return 0000;
	}

	@Override
	public String transferAmount() {
		return "Yes Amount Transferred";
	}

	@Override
	public String miniStatement() {
		return "1.Account Created \n 2.Amount Debited \n 3.Amount Credited \n 4.Amount Withdrawn \n 5.ATM pin Changed";
	}

	@Override
	public String accountHolderName() {
		return "SJR";
	}

	@Override
	public long accountNumber() {
		// TODO Auto-generated method stub
		return 1234567890987654321l;
	}

	@Override
	public String changeAccountType() {
		// TODO Auto-generated method stub
		return "Current Account";
	}

	@Override
	public char closeAccount() {
		// TODO Auto-generated method stub
		return 'Y';
	}

}
