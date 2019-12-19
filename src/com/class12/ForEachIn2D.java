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
		for (int row=0; row<groceryList.length; row++) {
			for (int col=0; col<groceryList[1].length; col++) {
				System.out.print(groceryList[row][col]+" ");
			}System.out.println();
		}
		
		for (String singleGroceryList[] :groceryList) {
			for(String arr : singleGroceryList) {
				System.out.print(arr+ " ");
			}System.out.println();
		}
	}

}
