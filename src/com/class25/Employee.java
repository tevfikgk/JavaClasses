package com.class25;
// eger bu class (com.class25.Employee) baska bir package deki bi class tarafindan import edilirse 
//(import com.class25.Emploeyee) yine "extends" yapilabilir. Burdaki public olan variable, method vb ulasabilir. subclass oldugu icin protected e de ulasir. 
// Default ve private a ulasamaz. 
//Constructors are not been inheritance. Because they must have the same name name of the class.
public class Employee {

		int salary;
		static String companyName;
		void work() {
		System.out.println("I work in "+companyName+" company");
		}
		void getPaid() {
		System.out.println("I get paid "+salary);
		}
}
