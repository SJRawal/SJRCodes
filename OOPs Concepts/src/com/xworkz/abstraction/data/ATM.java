package com.xworkz.abstraction.data;

public abstract class ATM {
  abstract boolean deposit();
  abstract boolean withdraw();
  abstract float checkBalance();
  abstract int pinATM();
  abstract String transferAmount();
  abstract String miniStatement();
  abstract String accountHolderName();
  abstract long accountNumber();
  abstract String changeAccountType();
  abstract char closeAccount();
}
