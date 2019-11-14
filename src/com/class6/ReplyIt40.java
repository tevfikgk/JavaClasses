package com.class6;

import java.util.Scanner;

public class ReplyIt40 {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		   System.out.println("enter the age of the Child");
		   int age=scan.nextInt();
                 
 String ability;
 switch(age){
			      case 1:
			        ability="You can Crawl";
			        break;
			      case 2:
			        ability="You can Talk";
			        break;
			      case 3:
			        ability="You can Dance";
			        break;
			      case 4:
			        ability="You can get trouble";
			        break;
			      default:
			        ability="I don't know how old you are";
			   }
			System.out.println(ability);
	}

}
