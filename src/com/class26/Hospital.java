package com.class26;

public class Hospital {
 public static void main(String[] args) {
	Doctor d1=new Doctor("John","Family Doctor",123456);
	//d1.name="Dr John";  //after we produce constructor we dont need them.
	//d1.speciality="Family Doctor";
	//d1.licenceId=123456;
	
	d1.displayInfo();
	d1.checkup("Adam");
	
	Doctor d2=new Doctor("James","Eye Doctor", 2345,"106 Devendhire","Sunday");
	d2.displayInfo();
	d2.checkup("James");
	
	Dermotologist d3=new Dermotologist("emily","Dermotologist",1246);
	d3.displayInfo();
	d3.chargePatientDermotologiest();
}
}
