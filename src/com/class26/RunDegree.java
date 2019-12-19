package com.class26;

public class RunDegree {
public static void main(String[] args) {
	Degree obj1=new Degree();
	obj1.getDegree();
	
	
	//widening
	//double d=90;
	//narrowing
	//int i=(int)1.99;
	//Non primitive Typecasting
	//widening-->creating an object of the child class and given reference to the parent class
	Degree obj= new Undergraduate(); 
	//narrowing
	// Postgraduate obj= new Degree();-->can not convert from parent to child class
	
	obj.getDegree();// it comes from child class --> Runtime polymorfism **********************************
	//obj.heyyy not accesable
	//if there is a overriding it execute child class. if no, execute parent class
	

}
}
