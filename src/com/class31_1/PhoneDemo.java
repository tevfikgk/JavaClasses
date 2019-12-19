package com.class31_1;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone phone=new Phone("1-23456790");
		phone.sendText("12345", "privet");
		phone.call("1234443");
	}

}
