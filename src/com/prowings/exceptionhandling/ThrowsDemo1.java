package com.prowings.exceptionhandling;

 import java.io.FileNotFoundException;
 
public class ThrowsDemo1 {
	
	public static void main(String[] args) throws FileNotFoundException, CloneNotSupportedException {
		
		System.out.println("main started");
		
		myMethod(10,20);
		
		myMethod(10d,20);
		
		System.out.println("main ended");
		
	}


	public static void myMethod(int i, int j) {
		
		System.out.println("myMethod started");
		throw new NullPointerException("can not perform any operation on null object!!");
		
	//	System.out.println("myMethod Ended");
 		
	}

	public static void myMethod(double d, int j) throws FileNotFoundException, CloneNotSupportedException
	{
		System.out.println("myMethod(double, int) started");
		
		int res = 0;
		if(res == 10)
			throw new FileNotFoundException("File is not present at specified directory!!");
		else
			throw new CloneNotSupportedException();
	//	System.out.println("myMethod ended");
		
	}
	 

}
