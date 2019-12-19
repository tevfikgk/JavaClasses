package com.class29;

public abstract class Human { //extends to object class

		String name;
		int age;
		int weight;
		
		public Human() {
			//super(); //because its extend automatically object class. We dont have to write
			System.out.println("Human is creating");
		}
		
		public Human(String name) {
			this(); //line 9 cagriliyor.
			this.name=name;
			System.out.println("the name of the person "+name);
		}
		
		public Human (String name, int age, int weight){
			//super(); //because its extend automatically object class. We dont have to write
			this(name);
			this.age=age;
			this.weight=weight;
			System.out.println(name+ " "+age+" "+weight);
		}
		
		public abstract String greeting();
		
		
		public abstract void talk();
		
}
