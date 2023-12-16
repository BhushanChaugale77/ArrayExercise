// Question  = Count the vowels and consonants from given String 


package com.prowings.stringclassdemo;

public class CountVowelsConsonants {
	
	public static void countVowelConsonents(String s)
	{
		
		int vowelCount = 0;
		
		int consonantCount = 0;
		
		s=s.toLowerCase();
		
		for(int i=0; i<s.length();i++)
		{
			char resultedChar = s.charAt(i);
			
			if(resultedChar == 'a' && resultedChar <= 'z')
			{
				if (resultedChar =='a' || resultedChar == 'e' || resultedChar == 'i' || resultedChar =='o' || resultedChar =='u')
					
					vowelCount ++;
				
				else
					
					consonantCount ++;
				
				System.out.println("toel vowels is :"+vowelCount);
				System.out.println("total consonant count is :" +consonantCount);
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		String input = "India is my country";
		
		countVowelConsonents(input);
		
	}

}
 