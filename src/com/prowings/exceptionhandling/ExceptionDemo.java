package com.prowings.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Hello!!!");
		System.out.println("Hello!!!");
		System.out.println("Hello!!!");
		System.out.println("Hello!!!");
		myMethod();
		System.out.println("Hii!!!");
		System.out.println("Hii!!!");
		System.out.println("Hii!!!");
		System.out.println("Hii!!!");
		System.out.println("Hii!!!");
	}

	public static void myMethod() {

		System.out.println("inside my Method!!");
		System.out.println("inside my Method!!");
		System.out.println("inside my Method!!");
		int i = 0;
		try {

			int res = 10 / i;
		}
		
		  catch(ArithmeticException e) { System.out.println("Inside Catch block");
		  
		  }
		 
		finally {
			System.out.println("Finally Executed");

		}
		System.out.println(">>>>Res>>>" + i);
		System.out.println("hii");
		System.out.println("hii");
		System.out.println("hii");

	}

}
