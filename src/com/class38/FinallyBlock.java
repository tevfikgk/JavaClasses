package com.class38;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String str="Hello";
		
		try{
			char charter=str.charAt(20); //new StringIndexOutOfBoundsException:
		System.out.println(charter);
		} 
		catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
		}finally {                        //it is a block that always be executed
			System.out.println("I am a finally block");
		}
		System.out.println("End of the code");
	}

}
