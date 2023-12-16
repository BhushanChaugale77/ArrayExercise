package com.prowings.exceptionhandling;

public class TryCatchDemo2 {
	public static void main(String[] args) {
		
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		
		int res = 0;
		
		int [] num = {10,20,30,50};
		
		try {
			
			res = num[2]/0;
			System.exit(0);
			System.out.println("result is :" + res);
			
			
		}
		catch (ArithmeticException e){
			
			System.out.println("ArithmeticException");
			
		}
		catch(ArrayIndexOutOfBoundsException f) {
			
			System.out.println("ArrayIndexOutOfBoundsException f");
			
		}
		catch(Exception h)
		{
			
			System.out.println("Exception caught in Exception catch block!!");
		}
		finally {
			System.out.println("inside finally block!!");
		}
		
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");
	}

}
