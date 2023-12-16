package com.prowings.stringclassdemo;

public class RemoveWhiteSpaces {
	
	static String s = "India is my Country";
	
	static String result;
	
	public static String removeWhiteSpaces(String s)
	{
		
	//	result = s.replace(" ", " ");
        result = s.replaceAll(" ", " ");

        return result;
        
       }

	public static void main(String[] args) {
		
		
		removeWhiteSpaces("India is my Country");
		
		System.out.println("resulted String is :" + result);
	}
}

// output is :
// resulted String is IndiaismyCountry