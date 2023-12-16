package com.prowings.stringclassdemo;

import java.util.Arrays;

public class WordCount {

	public static void main(String[] args) {

		String s1 = "India is my country.India has 29 states." + "India is beautiful country."
				+ "India is 7th largest country in the world." + "India is biggest democratic nation";

		wordCount(s1);

	}

	public static void wordCount(String s1) {

		System.out.println("original string is : " + s1);

		String s2 = s1.trim().replaceAll("[.'-]", " ").toLowerCase();

		System.out.println(s2);

		String[] words = s2.split(" ");

		System.out.println(s2);

		System.out.println(Arrays.toString(words));

		for (int i = 0; i < words.length; i++) {
			String currentWord = words[i];

			if (!currentWord.isEmpty()) {
				int count = 1;

				for (int j = i + 1; j < words.length; j++) {
					if (currentWord.equalsIgnoreCase(words[j])) {
						count++;

						words[j] = " ";

					}
				}

				System.out.println(currentWord + " : " + count);

			}
		}

	}

}
