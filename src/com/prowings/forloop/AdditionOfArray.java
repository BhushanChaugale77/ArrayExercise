package com.prowings.forloop;

public class AdditionOfArray
{
	
		
		public static int[] arraysSum(int[] a,int[] b)
		{
			int[] res = new int [a.length];
			
			for(int i=0; i<a.length; i++)
			{
				for(int j = 0; j<b.length; j++)
				{
					if(i==j)
					{
						res [i] = a [i] + b[j];
						
					}
				}
			
			}
			return res;
		}
	     
		public static void main(String[] args)
		{
			int [] a = {1,7,9,5,4};
			
			for(int i = 0; i<a.length; i++)
			{
				System.out.println(a[i]);
			}
			System.out.println("_____________________________________");
			int[] b = {7,9,4,6,2};
			
			for(int i = 0; i<b.length; i++)
			{
				System.out.println(b[i]);
			}
			System.out.println("_____________________________________");

			int[] result = arraysSum(a,b);
			 
			for(int i = 0; i<result.length; i++)
			{
				System.out.println(result[i]);
			}
			
			
			
		}

}

