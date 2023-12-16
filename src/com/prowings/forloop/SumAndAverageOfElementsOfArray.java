package com.prowings.forloop;

public class SumAndAverageOfElementsOfArray {

	public static void main(String[] args) {

		System.out.println("main method started");
		int[] nums = { 1, 2, 3, 5, 7, 9, 45 };

		calculateSumandAverage(nums);

		System.out.println("main method ended");

	}

	private static void calculateSumandAverage(int[] nums) {

		int sum = 0;

		for (int n : nums) {
			sum += n;

		}

		System.out.println("Sum of all elements is :" + sum);
		int average = sum / nums.length;

		System.out.println("Average of all elements is :" + average);

	}

}
