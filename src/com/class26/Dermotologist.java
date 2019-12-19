package com.class26;

public class Dermotologist  extends Doctor{
 public Dermotologist (String name, String Speciality, int licenceId) {
	// super(); java calls default constructor
	 this.name=name;
	 this.speciality=speciality;
	 this.licenceId=LicenceId;
	 
 }
 //override
 	public void chargePatientDermotologiest() { //if we write "chargePatient it willdo overriding
 		System.out.println("Get me 100");
 	}
 
 	public void checkSkin() {
 		
 	}
}

