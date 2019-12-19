package com.class24;

public class BookClass {
//Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
	//Instance variables are being initialized
	//Both Constructors are being executed

	String name;
	int issuedYear;
	int numberOfPage;
	int price;
	
	BookClass(){
		System.out.println("2019 book fair best seller");
	}
	BookClass(String name, int issuedYear, int numberOfPage, int price){
		this.name=name;
		this.issuedYear=issuedYear;
		this.numberOfPage=numberOfPage;
		this.price=price;
		
	}	
	public void str() {
		System.out.println(name+" "+issuedYear+" "+numberOfPage+" "+price);
	
	}
	public static void main(String[] args) {
		BookClass book1=new BookClass();
		BookClass book=new BookClass("Eagle",2019,405,15);
		book.str();
	}
}
