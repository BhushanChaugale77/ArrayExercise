package com.prowings.stringclassdemo;

public class FirstOccurenceOfSubstring {
	
	public static int findOccuranceOfSubstring(String original, String target)
	{
		int indexOfTargetString = original.indexOf(target);
		
		System.out.println("occurence of target substring is: " + indexOfTargetString);
		
		return indexOfTargetString;
		
		
	}
	
	public static void main(String[] args) {
		
		String original = "Welcome to india";
		
		String target = "india";
		
		findOccuranceOfSubstring(original,target);
		
	}

}

