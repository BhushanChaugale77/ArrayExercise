package com.prowings.stringclassdemo;

public class ReplaceWithCharacters {
	
	public static String replaceWithNewCharacters(String s)
	{
		
		return s.replace("S", "B");
		
	}

	public static void main(String[] args) {
		
		String input = "Shivani";
		
		System.out.println("new resulted string is :" + replaceWithNewCharacters(input));
		
		
	}
}
//output: new resulted string is : Bhivani