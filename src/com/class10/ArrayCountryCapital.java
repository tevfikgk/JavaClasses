package com.class10;

public class ArrayCountryCapital {

	public static void main(String[] args) {

		String[] countries= {"Turkey","Greece", "German", "France"};
	
		for (int i=0; i<countries.length; i++) {
			
			switch (countries [i]) {
			case ("Turkey"):
				System.out.println("Ankara");
			break;
			
			case ("Greece"):
				System.out.println("Athens");
			break;
			
			case ("German"):
					System.out.println("Berlin");
			break;
			
			case("France"):
					System.out.println("Paris");
			break;
			 	
			
			}
			
		}
	}
}
