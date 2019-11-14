package com.class4;

public class NestedPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int valuesOfMortageRate=4;
	int mortagePrice=300000;
	if (valuesOfMortageRate>4.5) {
		System.out.println("You will not buy a house");
	}else {
		System.out.println("You should consider buying");
		if (mortagePrice>200000) {
			System.out.println("You have to take a loan");
		} else {
			System.out.println("You can pay cash");
		}
	}
	
	}

}
