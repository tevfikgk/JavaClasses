package com.class26;

public class Doctor {
	public String name;
	public String speciality;
	public int licenceId;
	public String address;
	public String dayOff;
	
	public Doctor() {
		
	}
	public Doctor(String doctorName, String doctorSpeciality, int doctorLicence) {
		name=doctorName; 
		speciality=doctorSpeciality;
		licenceId=doctorLicence;
	}
	
	public Doctor (String name, String speciality, int licenceId, String address, String dayOff) {
		this(name,speciality,licenceId); //line 11,12 ve 13 ile 18,19 ve 20 ayni oldugu icin variable tekrarindan kacinmak icin
		//this.name=name;
		//this.speciality=speciality;
		//this.licenceId=licenceId;
		this.address=address;
		this.dayOff=dayOff;
		chargePatient(); //*********icine void method yazdik. Basim sirasina dikkat et!
	}
	
	public void checkup(String name) {
	System.out.println("Doctor name "+ this.name+" make blood test for "+name);	//if we use same name as"name we put this. so first name refers to incident variable name
	//the second one for patient
	}
	
	public void treatPatients() {
		System.out.println("Gives a prescriptions");
	}
	public void chargePatient() {
		System.out.println("Give me 100");
	}
	
	public void displayInfo() {
		System.out.println("Doctor "+this.name+" with licence ID: "+ licenceId); //******without this possible
	}
}
