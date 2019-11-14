package com.class10;

import java.util.Scanner;

public class Review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	String[] array= new String[10];
	
	int i=0;
	String name=null;
	do {		System.out.println("Please enter name. when add last name write 'STOP'");
		name =scan.nextLine();
		name= array[i];
		i++;
	} while(!name.equals("STOP"));
		
	}

}
