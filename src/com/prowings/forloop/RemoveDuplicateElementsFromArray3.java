package com.prowings.forloop;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElementsFromArray3 {

	public static void main(String[] args) {

		Integer[] nums = { 5, 2, 3, 3, 7, 9, 9, 7, 5 };

		System.out.println("Original Array : " + Arrays.toString(nums));

		Integer[] uniqElements = removeDulicates(nums);

		System.out.println("unique Elemens : " + Arrays.toString(uniqElements));

	}

	public static Integer[] removeDulicates(Integer[] nums) {

		HashSet<Integer> uniqElementsSet = new HashSet<Integer>(Arrays.asList(nums));

		return uniqElementsSet.toArray(new Integer[uniqElementsSet.size()]);

	}
}
