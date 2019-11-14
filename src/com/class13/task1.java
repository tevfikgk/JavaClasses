package com.class13;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your class day:");
		String day=scan.nextLine();
		
		if (day.toLowerCase().equals("saturday")){                  //************
			System.out.println("Saturday is your Java class");
		} else if(day.equalsIgnoreCase("Sunday")) {                //************
			System.out.println("Sunday is your Git Class");
		} else {
			System.err.println("Invalid class day"); // PRINT RED COLOUR
		}
		//scanner.close(); ????????????????
	}

}
