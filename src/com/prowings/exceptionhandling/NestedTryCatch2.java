package com.prowings.exceptionhandling;

public class NestedTryCatch2 {
	
	public static void main(String[] args) {
	
		System.out.println("main started!!!");
		

	
	try {
		
		System.out.println("outer try");
		int res = 30 / 2; //Arithmetic
		String s = null;
		s.toCharArray(); //NPE
	}
	
	catch(NullPointerException e)
	{
		System.out.println("inside outer catch");
		try {
			
			System.out.println("inner try");
			String s = null;
			s.toCharArray(); // NPE
		   }
	
		catch (ArithmeticException e1) {
			System.out.println("inside inner catch");
		}
		finally 
		{
			System.out.println("inside inner finally");
		}

	 
	System.out.println("main ended");
	
	}
	
}
}



