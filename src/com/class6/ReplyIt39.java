package com.class6;

import java.util.Scanner;

public class ReplyIt39 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter name of the instructor");
	String name;
	name=scan.nextLine();
	String instructor;
	switch(name) {
	case ("Shiva"):
		instructor="Will take care of Java Assignment";
		break;
	case ("Sandish"):
		instructor="Will take care of SDLC Assignment";
		break;
	case ("Wegas"):
		instructor="Will take care of Selenium Assignment";
		break;
	case ("Asel"):
		instructor="Will take care of every Assignment";
	default:
		instructor=" Invalid instructor selected";
	}
	System.out.println(instructor);
	}

}

