package com.prowings.arrayexercise;

import java.util.Scanner;

public class SearchElementInArray {
	
	
	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int searchValue = scan.nextInt();
		
		int position = -1;
		
		for(int i=0; i<numbers.length;i++) {
			
			if(numbers[i] == searchValue) {
				position = i;
				break;
				
			}
		}
		if(position != -1) {
			System.out.println("Value found at position "+position);
		}else {
			System.out.println("value not found in the array.");
		}
		scan.close();
		}
		
	}


