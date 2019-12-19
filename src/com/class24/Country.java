package com.class24;

	
	
public class Country {
	public String capital, name;
	
	Country(){
		System.out.println("i am non argument constructor");
	}
	
	
	Country(String countryName, String countryCapital){
	name=countryName;
	capital=countryCapital;
	System.out.println(countryName+" is "+countryCapital);
			}
	
	public void displayInfo() {
		System.out.println(name+ "  "+capital);	
	}
	
public static void main(String[] args) {
	
	Country country1=new Country("USA", "Washington");
	//country1.name="USA";
	//country1.capital="Washington DC";
	
	Country country2=new Country("Turkey", "Ankara");
	//country2.name="Turkey";
	//country2.capital="Ankara";
	
	country1.displayInfo();
	country2.displayInfo();
}
}
