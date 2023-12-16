package com.prowings.forloop;

import java.util.Arrays;

public class FilterEvenNumbersFromArray {

	public static void main(String[] args) {

		int[] nums = { 2, 200, 77, 99, 65, 4, 48, 89, 32 };

		int[] result = filterEvenNumbers(nums);

		System.out.println("Filtered even numbers are : ");

		System.out.println(Arrays.toString(result));
	}

	public static int[] filterEvenNumbers(int[] nums) {

		System.out.println("Input array is : " + Arrays.toString(nums));

		int counter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				counter++;

			}
		}

		int anotherCounter = 0;
		int[] result = new int[counter];

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				result[anotherCounter] = nums[i];
				anotherCounter++;

			}
		}

		return result;
	}

}
