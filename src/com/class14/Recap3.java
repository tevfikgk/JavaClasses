package com.class14;

public class Recap3 {

		public static void main(String[] args) {
			
			String str1="Morning everyone. Groups, share your insights! "
					+ "how do you practice in groups? "
					+ "What do you do? Do you work on questions? do you do exercise? "
					+ "How long are your meetings? How often?:";
			
			System.out.println( str1.replaceAll("do you", "does he"));
			System.out.println(str1.toLowerCase().replace("do you","does he"));
		}
}
