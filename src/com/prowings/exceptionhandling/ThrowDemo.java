package com.prowings.exceptionhandling;

public class ThrowDemo {
	public static void main(String[] args) {
		
		System.out.println("main started");
		m1();
		System.out.println("main ended");
		
		
	}

	public static void m1() {
 
		System.out.println("m1 started");
		
		throw new NullPointerException();
		
//		System.out.println("m1 ended");
		
	}

}
