package com.prowings.forloop;

import java.util.Arrays;

public class FindSecondHighestNumberFromGivenArray {

	public static void main(String[] args) {

		System.out.println("Main Started!!!");

		int[] nums = { 10, 20, 30, 40, 15, 5, 20, 12, 8 };

		System.out.println("Original Array :" + Arrays.toString(nums));

		int secondHighestNumber = findSecondHightestNumber(nums);

		System.out.println("Second Hightest Number from given array is : " + secondHighestNumber);

		System.out.println("main ended!!!");
	}

	public static int findSecondHightestNumber(int[] nums) {

		int temp = 0;

		// step 1 - sort the array
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("After sorting :" + Arrays.toString(nums));

		// step 2 - return second highest number
		return nums[nums.length - 2];
	}

}
