package com.prowings.stringclassdemo;

public class StringDemo6 {

	public static void main(String[] args) {
		
		String s1 = "helloworld";
		String s2 = "world";
		
		String s3 = s1.substring(5);
		System.out.println(s3);
		System.out.println(s2==s3);
		
		String s4 = s1.substring(0,5);
		System.out.println("<<<<<<<<<<<<<");
		System.out.println(s4);
		System.out.println(">>>>>>>>>>>>>>>");
		
	}
	
}
