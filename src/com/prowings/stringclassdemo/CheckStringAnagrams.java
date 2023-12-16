
//Question : check two strings are anagrams or not 

package com.prowings.stringclassdemo;

public class CheckStringAnagrams {

	public static boolean isStringAnagrams(String firstword, String secondword) {
		char[] array1 = firstword.toCharArray();
		char[] array2 = secondword.toCharArray();

		if (array1.length == array2.length) {

			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++)

				{
					if (array1[i] == array2[j]) {
						array2[j] = ' ';
						break;
					}
				}
			}

			for (int i = 0; i < array2.length; i++) {

				if (array2[i] != ' ')
					return false;

			}
			return true;

		} else
			return false;

	}

	public static void main(String[] args) {

		boolean result = isStringAnagrams("care", "race");

		if (result)
			System.out.println("two strings are anagrams!!");
		else
			System.out.println("two strings are not anagrams!!");

	}

}
// output : two strings are anagrams!!