package com.class10;

import java.util.Scanner;

public class ReplyIt77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	
		Scanner scan=new Scanner(System.in);
		
		String teamMembers[]=new String[5]; 
		
		for (int i=0; i<teamMembers.length; i++) {
		System.out.println("Enter "+ (i+1)+ " player");
		teamMembers[i]=scan.nextLine();
		}
		
		for (int k=0; k<teamMembers.length; k++) {
		System.out.print(teamMembers[k]+" ");
		}
		
		
		
	/*Scanner scan=new Scanner(System.in);
	
	String[] day=new String[7];
	
	for (int i=0; i<day.length; i++) {
		System.out.println("please enter "+ (i+1) + " of week");
		day[i]=scan.nextLine();
	}
	for (int k=0; k<day.length; k++) {
		System.out.println(day[k]);
	}*/
	
	
	
	
	}

}
