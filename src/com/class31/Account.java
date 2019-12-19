package com.class31;

public class Account {
	
	private long accountNumber;
	private double balance;
	//getters- give read only access
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}	
		//setter-give write only access
	public void setBalance(int amount) {
		balance=balance+amount;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
		if (String.valueOf(accountNumber).length()==9) {
			this.accountNumber=accountNumber;
		}
	}
	}



