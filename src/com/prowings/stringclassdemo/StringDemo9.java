package com.prowings.stringclassdemo;

public class StringDemo9 {

	
	public static void main(String[] args) {
		
		String line = "India, is, my, country";
		 
		String[]words = line.split(",");
		
		for (String word : words)
			System.out.println(word);
		
		String s1 = "hello";
		
		char[]chars = s1.toCharArray();
		
		for(char c : chars)
			System.out.println(c);
		
		
	}
}
