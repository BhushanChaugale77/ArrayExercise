package com.prowings.exceptionhandling;

public class TryCatchDemo5 {

	public static void main(String[] args) {

	System.out.println("main method started!!!");
	

	 try {
		 System.out.println("inside try");
		int res = 10/0;
		try {
			System.out.println("inside nested try");
			System.exit(0);
		    } 
		catch (Exception e)
		{
			System.out.println("inside nested catch block!!!");
		 
		}
		finally
		{
			System.out.println("inside nested finally block!!!");
		 
		}
	 }
	 catch (Exception e) {
		 System.out.println("inside catch");
	 }
	 
	 finally
	 {
		 System.out.println("inside finally");
		 
	 }
	 
	 System.out.println("main method ended!!");
	 
	}
}

		


	
	

