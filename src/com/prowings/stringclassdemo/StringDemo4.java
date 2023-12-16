package com.prowings.stringclassdemo;

public class StringDemo4 {

	public static void main(String[] args) {

		String s1 = "helloworld";

		StringBuffer s2 = new StringBuffer("helloworld");

		//System.out.println(s1 = s2);

		System.out.println(s1.equals(s2)); // since s2 is not of string type, equals methods only check content equality
											// in string only

		System.out.println(s1.contentEquals(s2));

	}

}
