package com.prowings.forloop;

public class ForLoop9 {

	public static void main(String[] args) {
		
		//inverted half pyramid
		
		int rows = 5;
		
		for(int i = rows; i>=1; --i)
		{
			for(int j = 1; j<=i; ++j)
			{
				System.out.println(j+ " ");
			}
		}
 
		
	}
	
}
