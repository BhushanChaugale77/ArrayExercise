package com.prowings.exceptionhandling;

public class ExceptionRethrowing {
	
	public static void main(String[] args) {
		System.out.println("main started");
		myMethod(10,0);
		System.out.println("main ended");
		
	}

	public static void myMethod(int i, int j) {
 		
		System.out.println("myMethod started!!!");
		
		try {
			int res = i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("take some action");
			throw e;
		}
		finally {
			System.out.println("finally executed");
		}
		
		System.out.println("myMethod ended!!!");
	}

}