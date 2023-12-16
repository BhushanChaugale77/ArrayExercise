//Question: 1 write a program to reverse a given string
// 2. check if given string pallindrome or not

package com.prowings.stringclassdemo;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String input = "RADAR";
		System.out.println("INPUT STRING IS :" +input);
		
		//String reversedString = reverseGivenString(input);
		String reversedString = reverseGivenStringUsingStringBuffer(input);
		
		System.out.println("reversed string is :" + reversedString);//op : dcba
		
		String result = isPallindromne(input) ? " pallindrome " : "not pallindrome";
		
		 System.out.println(result);
		
	}

	public static boolean isPallindromne(String input) 
	{
	 
		 if(input.equals(reverseGivenString(input)));
		           
		          return true;
		//or
		
		//return input.equals(reverseGivenString(input));
		
		}
	

	public static String reverseGivenString(String input) {
		char[] chars = input.toCharArray();
		char[] reversedChars = new char[chars.length];
		
		int counter = 0;
		
		for(int i = chars.length-1; i >= 0; i--)
		{
			
			reversedChars[counter] = chars[i];
			counter++;
			
		}
	   return new String(reversedChars);
	}

	public static String reverseGivenStringUsingStringBuffer(String input) 
	{
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		
		return new String(sb);
		
	
	}

}
