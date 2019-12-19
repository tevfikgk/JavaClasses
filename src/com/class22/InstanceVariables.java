package com.class22;

public class InstanceVariables {

		String name="Samir"; //instance variable. Both string variable is"name" Can be.Because not in samewhere
		
		public static void main(String[] args) {
			
		String name="Burcu"; //local variable
		
		System.out.println(name); // output is "Burcu"
		
		//in order to print "Samir"
		
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		}
}
