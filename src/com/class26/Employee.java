package com.class26;

public class Employee {
	
	public int salary;
	public void getPaid() { //(parent class) overriden
		System.out.println("Employees get paid "+salary);
	}
}
