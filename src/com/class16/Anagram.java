package com.class16;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println("Please enter two strings");
		
		Scanner scan = new Scanner(System.in);
		
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		
		if(word1.length()==word2.length()) {
			
			char[] a1 = word1.toLowerCase().toCharArray();
			char[] a2 = word2.toLowerCase().toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			if(Arrays.equals(a1, a2)) {
				System.out.println(word1+" and "+ word2+" are anagram");
			}
			else {
				System.out.println(word1+" and "+ word2+" are NOT anagram");
			}
		}
		else {
			System.out.println(word1+" and "+ word2+" are NOT anagram");
		}
	}

}
