package com.class21;

public class Employee {

	int eID=5;
	int salary=200;
	static String CEO="Sumair";
	void printInfo() {
		System.out.println("Employee Id; "+ eID+" salary is: "+salary+ " CEO is : " +CEO);
		
	}
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.printInfo();
		CEO="Conair";
		Employee emp2=new Employee();
		emp2.printInfo();
	}
	
}
