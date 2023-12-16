package com.prowings.arrayexercise;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int [] number = {1,7,5,9,11,13,15};
		
 		
		int res = SumOfAllElements(number); 
		
		System.out.println("the sum of all elements is  :"+ res);
	}

	private static int SumOfAllElements(int[] number) {
		 
		
		int res = 0;
		
		for(int i=0; i<number.length; i++)
			
			res += number[i]; 
			
		return res;
	}

	 
 		
	}


