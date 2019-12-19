package com.class26;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.salary=8000;
		emp.getPaid();
		
		FullTime ft=new FullTime();
		ft.salary=9000;
		ft.bonus=10000;
		ft.getPaid();
	}

}
