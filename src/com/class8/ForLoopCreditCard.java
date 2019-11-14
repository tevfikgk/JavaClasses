package com.class8;

import java.util.Scanner;

public class ForLoopCreditCard {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("Are you apliying credit card?");
			String card;
			card=scan.nextLine();
			if (card.equals("yes")){
				break;
			}
					
		}
	}

}
