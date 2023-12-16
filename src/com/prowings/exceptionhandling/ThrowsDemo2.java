package com.prowings.exceptionhandling;
 import java.io.File;
 import java.io.FileWriter;
 import java.io.IOException;
  
public class ThrowsDemo2 {
	
	public static void main(String[] args)  
	{
		
		System.out.println("main started");
		m1();
		System.out.println("main ended");
		
	}

	public static void m1()  {
		System.out.println("m1 started");
		m2();
		System.out.println("m2 ended");
	}

	public static void m2() throws ArithmeticException ,   NullPointerException   {
 
		System.out.println("m2 started");
 		System.out.println("m2 ended");                   
		
	}

	 

}
