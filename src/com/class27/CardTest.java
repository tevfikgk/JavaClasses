package com.class27;

public class CardTest {
public static void main(String[] args) {
	int i=10; //primitive
	String str="Hello"; // non primitive ****Scanner scan, Card card all non primitive ***
	//taken Object of the child clas and give reference to the parent
	// reference variable=object is created
	Card card=new AX(); // only accesable for CARD class
	card.chargeInterest(); //COMES FROM PARENT CLASS
	card.creditLimit(); //but during runtime comes from child class (IF OVERRIDING HAPPENS LIKE THIS  ******** RUN TIME POLYMORFOISIM
	Card card1=new MC(); 
	card1.chargeInterest();
	Card card2=new Visa(); 
	card2.chargeInterest();
	
	//we created objects and assigned to the variables and thrn stored those variables inside array
	Card[] cardArray= {card,card1,card2};
	// we created an objects and storing it directlr into an array of card
	Card[] cardArray1= {new MC(), new AX(), new Visa(), new Discovery()}; //***********************************
	
	for(Card myCard:cardArray1) {
		myCard.creditLimit();
	}
	
	System.out.println("*********************");
	
	MC mc1=new MC();
	MC mc2=new MC();
	MC mc3=new MC();
	
	MC[] masterCards = {mc1,mc2,mc3};
	for (MC mCard:masterCards) {
		mCard.cashBack();
		mCard.chargeInterest();
		mCard.creditLimit();
	}
	
	
	
	
	
}
}
