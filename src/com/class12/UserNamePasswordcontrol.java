package com.class12;

import java.util.Scanner;

public class UserNamePasswordcontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter username");
		String userName, password, confirmedPassword, message;
		userName=scan.nextLine();
		
		System.out.println("Please enter password");
		password=scan.nextLine();
		
		System.out.println("Please enter confirmed Password");
		confirmedPassword=scan.nextLine();		
		if (!(userName.isEmpty() && password.isEmpty())) {  //first check point
			if (password.length()>8) {//second checkpoint
				if(!password.contains(userName)){
					if( password.equals(confirmedPassword)) {
						message="Your username and password has been created";
						}else {
							message ="Password do not match";
							}
						
				}else {
					
					message="Password can not contain username";
				}
			} else {message="Password is too short";
			}
			
	}else {
			message="Username and Password can not be empty";
	}System.out.println(message);
	
	
	}

}
