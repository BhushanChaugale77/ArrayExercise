package com.prowings.arrayexercise;

import java.util.Arrays;

public class UniqueElementsInArray {

	public static void main(String[] args) {

		int[] numbers = { 7, 9, 3, 9, 3, 4, 5, 5, 7, 7, 1, 2, 3, 4 };
		
		System.out.println("Original Array :"+Arrays.toString(numbers));
		
		uniqueElements(numbers);

	}

	public static void uniqueElements(int[] numbers) {

		int n = numbers.length;

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				if (numbers[i] == numbers[j]) {
					numbers[j] = numbers[n - 1];
					n--;
					j--;

				}
				// System.out.println(numbers[j]+" ");
			}
		}

		int[] result = Arrays.copyOf(numbers, n);
		System.out.println("unique element array " + Arrays.toString(result));

	}

}
