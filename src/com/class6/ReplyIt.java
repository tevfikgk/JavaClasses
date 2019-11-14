package com.class6;

import java.util.Scanner;

public class ReplyIt {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Is it weekend? True or False");
		String subject=null;
		boolean lesson=scan.nextBoolean();
		if (lesson==true){
		  subject="java";
		}else {
		  subject="Manuel testing";
		}
		  
		  System.out.println ("Today you will be learning " + subject );
		}
	
		
	
	
	}
	
	

