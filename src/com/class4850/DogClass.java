package com.class4850;

class Main {
	  String dogName;
	  int dogWeight;
	  static String dogBreed="Mutt";
	  
	  Main (String dogName, int dogWeight, String dogBreed){
	    this.dogName=dogName;
	    this.dogWeight=dogWeight;
	    this.dogBreed=dogBreed;
	  }
	  
	  Main (String dogName, int dogWeight){
	    this.dogName=dogName;
	    this.dogWeight=dogWeight;
	  }

	  void display1 (String dogName, int dogWeight, String dogBreed){
	  System.out.println("Dog name is "+dogName+" its weight: "+dogWeight+" it breeds with "+dogBreed);
	  }
	  void display1 (String dogName, int dogWeight){
	  System.out.println("Dog name is "+dogName+" its weight: "+dogWeight);
	  }

	public static void main(String[] args) {
	    Main obj=new Main ("Tarzan",50,"Mutt");
	  // System.out.println(obj.display1("Tarzan",50,"Mutt"));
	  }
	}
	      
	      
	      

