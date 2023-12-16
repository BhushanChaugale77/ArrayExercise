package com.prowings.stringclassdemo;

public class StringDemo1 {

	
	public static void main(String[] args) {
		
		char[] data = {'h','e','l','l','o'};
		
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = new String("data");
		
		System.out.println(s1=s2);
		System.out.println(s1=s3);
		System.out.println(s2=s3);
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	
		System.out.println("before s1 interned :" +(s1==s2));
		
		s1=s1.intern();
		System.out.println("After s1 interned :"+(s1=s2));
	
	}
	
}
