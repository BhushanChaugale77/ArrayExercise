package com.prowings.stringclassdemo;

public class StringDemo2 {

	 

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "World";

		String s3 = new String("hello");
		String s4 = new String("World");

		String s5 = new String("helloworld");
		String s6 = "helloworld";

		String s7 = s1 + s2; // concatination opretor always creats new string means outside s.e.p
		System.out.println(s7);
		System.out.println(s6 == s7);

		String s8 = s3 + s4; // concatination opretor always creats new string

		System.out.println(s6 == s8);

		String s9 = s1.concat(s2);// concat method also always creats new string

		System.out.println(s6 == s9);
		System.out.println(s6.equals(s9));

		String s10 = s3.concat(s4);// concat method also always creats new string

		System.out.println(s6 == s10);

	}
}
