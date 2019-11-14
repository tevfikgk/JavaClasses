package com.class6;

import java.util.Scanner;

public class ReplyIt41 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the roll number of the Child");
	int rollNumber=scan.nextInt();
	String name;
	switch(rollNumber){
	  case 101:
	    name="Student name: Ramesh ";
	    break;
	   case 102:
	    name="Student name: Mahesh ";
	    break;
	    case 103:
	     name="Student name: Mukesh ";
	     break;
	    default:
	    System.out.println("No name");
	}
	
}
}