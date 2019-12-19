package com.class30;

interface Outputs{
	
	void display (double result);
}

interface Functions extends Outputs{
	  double adding (double firstNumber, double secondNumber);
	  double subtracting (double firstNumber, double secondNumber);
	  double multply (double firstNumber, double secondNumber);
	  double dividing (double firstNumber, double secondNumber);
	}

	class Main implements Functions{
	    
		public double adding (double firstNumber, double secondNumber){
	    double result=firstNumber+secondNumber;
	    return result;
	  }
	  public double subtracting (double firstNumber, double secondNumber){
	    double result=firstNumber-secondNumber;
	    return result;
	  }
	  public double multply (double firstNumber, double secondNumber){
	   double  result=firstNumber*secondNumber;
	    return result;
	  }
	  public double dividing (double firstNumber, double secondNumber){
	  double   result=firstNumber/secondNumber;
	    return result;
	  }
	  public void display (double result){
	    System.out.println("Result is :::"+result);
	  }
	  public static void main(String[] args) {
			Main obj=new Main();
			obj.adding(100.00, 20.00);
		}
	}