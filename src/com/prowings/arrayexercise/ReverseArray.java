package com.prowings.arrayexercise;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		
	 int [] numbers = {1,2,3,4,5,7,8,9};
	 
	 System.out.println("Original Array is :"+Arrays.toString(numbers));
	 
	 
	//reverseArray(numbers);
	 
	System.out.println("Reverseed Array is "+Arrays.toString(reverseArray(numbers)));
		
		
		
	}

	public static int[] reverseArray(int[] numbers) {
 
		int [] reversedArray = new int[numbers.length];
		int count=0;
		for(int i = numbers.length-1; i >= 0; i--)
		{
			reversedArray [count++] = numbers[i];
		}
		return reversedArray ;
		
	}

}
