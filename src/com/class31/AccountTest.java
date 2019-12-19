package com.class31;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Account acc=new Account();
		acc.getAccountNumber();
		acc.getBalance();
		acc.setAccountNumber(123456789);
		long accountNum=acc.getAccountNumber();
		System.out.println(accountNum);
		acc.setBalance(200);
		double myBalance=acc.getBalance();
		System.out.println(myBalance);
		
		int num=123;
		String.valueOf(num); //converts given value to string **************************************
		System.out.println(String.valueOf(num));
		
	}

}
