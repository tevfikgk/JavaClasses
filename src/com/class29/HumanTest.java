package com.class29;

public class HumanTest {

	public static void main(String[] args) {

			
			//Human person1=new Human("Andrei");
			//Human person2=new Human("Saim",25,150);
			
			Human person3=new American("John",42,250,"1111111"); //  ici bos oldugunda "human is creating basiyor cunku classlarinda default super const var ve human extends
			person3.talk();
			Human person4=new Albanian("Als",23,120,"123456");  //ici bos oldugunda  "human is creating basiyor cunku classlarinda default super const var ve human extends
			person4.talk();
			Human person5=new Turk("Als",23,120,"00012345");
			
			
	}
	

}
