package com.class4850;

import java.util.Scanner;

public class IfconditionRevenue {

	public static void main(String[] args) {

		/*The discount rate is 10% for the quantity purchased between 100 and 120 units, and 15% for the quantity purchased greater than 120 units. If the quantity purchased is less than 100 units, the discount rate is 0%. See the example output as shown below:
			Enter unit price: 25

			Enter quantity: 110

			The revenue from sale: 2475.0$

			After discount: 275.0$(10.0%)*/	
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter unit price");
	int unitPrice=scan.nextInt();
	
	System.out.println("Enter quantity");
	int unitQuantity=scan.nextInt();
	
	int revenueFromSale=unitPrice*unitQuantity;
	
	if (unitQuantity>=120) {
		int afterDiscount=revenueFromSale- (revenueFromSale*10/100);
		System.out.println(afterDiscount);
	}	if (unitQuantity<120) {
		int afterDiscount=revenueFromSale- (revenueFromSale*5/100);
		System.out.println(afterDiscount);
	}
	
	}

}
