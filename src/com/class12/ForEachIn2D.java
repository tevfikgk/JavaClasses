package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*GroceryList ; fruits, veggies,dairy
		 * Retrive all values using different loops
		 */
	
		String[][] groceryList= {
	
			{"melon", "banana", "strawberies"},
			{"cucumber", "tomato", "pepper"},
			{"milk", "egg" , "butter"}
	
		};	
		
		for (String singleGroceryList[] :groceryList) {
			for(String arr : singleGroceryList) {
				System.out.print(arr+ " ");
			}System.out.println();
		}
	}

}
