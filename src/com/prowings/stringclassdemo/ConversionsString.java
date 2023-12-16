// Write a program which accepts Roman Number & converts into Integer

package com.prowings.stringclassdemo;

public class ConversionsString {

	public static void main(String[] args) {

		// object or primitive to string

		int n = 10;
		String number = String.valueOf(n);
		String num = "10";
		System.out.println(number);
		System.out.println(number == num); // makes new string
		boolean res = true;
		String convertedRes = String.valueOf(res);
		System.out.println(convertedRes);
//		Student s = new Student(10, "ram", "pune");
	//	String student = String.valueOf(s);
	//  System.out.println(student);
		char[] chars = { 'h', 'e', 'l', 'l', 'o' };
		String data = String.valueOf(chars);
		System.out.println(data);
		String data2 = String.valueOf(chars, 2, 3);// method on array
		System.out.println(data2);

		// String to primitive

		int convertedNum = Integer.parseInt(num);
		System.out.println(convertedNum + 5);// To check is converted into primitive ,,,if this is string output is
												// "10"5; but if primitive then output is 15;

	}
}
