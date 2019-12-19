package com.class24;

public class Engineer {

	String name, salary;
	
	private Engineer (String workerName, String workerSalary) { //******we can not use static, final, abstract with constructor
		name=workerName;
		salary=workerSalary;
		//this.name=name (instead of workerName) //*********************************************
		//this.salary=salary
	}	
	public void abc() {
		System.out.println(name+salary);
	
	
	}
public static void main(String[] args) {
	Engineer factory=new Engineer("Hans", "$42500");
	factory.abc();
	
}
}
