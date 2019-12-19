package com.class31;

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
		double result=0;
		public double adding (double firstNumber, double secondNumber){
	    result=firstNumber+secondNumber;
	    return result;
	  }
	  public double subtracting (double firstNumber, double secondNumber){
	    result=firstNumber-secondNumber;
	    return result;
	  }
	  public double multply (double firstNumber, double secondNumber){
	    result=firstNumber*secondNumber;
	    return result;
	  }
	  public double dividing (double firstNumber, double secondNumber){
	    result=firstNumber/secondNumber;
	    return result;
	  }
	  public void display (){
	    System.out.println("Result is :::"+result);
	  }
	  public static void main(String[] args) {
			Main obj=new Main();
			obj.adding(80.00, 20.00);
			obj.display();
		}
	@Override
	public void display(double result) {
		// TODO Auto-generated method stub
		
	}
	}


