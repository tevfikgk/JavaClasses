package com.class6;

import java.util.Scanner;

public class ScannerSwitch {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	String country;
	String foodName;
	System.out.println("Please enter your country");
	country =scan.nextLine();
	
	switch (country) {
	case "Turkey":
		foodName="kebap";
		break;
	case "Ethiopia":
		foodName="Tibs";
		break;
	case "Morocco":
		foodName="Tajin";
		break;
	case "Russian":
		foodName="Caviar";
		break;
	default:
		foodName="Unknown";
	}
	System.out.println("You are from "+country+" Your favorite food name is "+ foodName);

}
}
