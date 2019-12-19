package com.class31_1;

public class Phone {

	String serialNumber;
	
	public Phone (String serialNr) {
		serialNumber=serialNr;
	}
	
	public  void sendText (String number, String text) {
		System.out.println("Sending: "+text+" to "+number);
	}
	public void call(String number) {
		System.out.println("Calling: "+number);
	}

}
