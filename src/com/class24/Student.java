package com.class24;

public class Student {
//Write program as a Student class � that has instance variables name and address. 
//Create a constructor that will initialize those variables. Print name & address of given� student by the displayInfo method.

 String name;
 String address;
 
 Student (String name, String address){
	 this.name=name;
	 this.address=address;
 }
 	public void displayInfo() {
	 System.out.println("Student name:"+name+ " and Student address:"+address);
 
 }
 public static void main(String[] args) {
	Student info=new Student("Ali","109 Dene Dr.Murphy");
	info.displayInfo();
}

}
