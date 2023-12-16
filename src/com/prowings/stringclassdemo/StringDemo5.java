package com.prowings.stringclassdemo;

public class StringDemo5 {

	public static void main(String[] args) {
		 
		String s1 = "helloworld";
		String s2 = "HelloWorld";
		
		System.out.println(s1.equals(s2));// false it checks case also
		
		System.out.println(s1.equalsIgnoreCase(s2));//true because of euualsIgnoreCase() method
		
	}
	
}
