package com.prowings.stringclassdemo;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {

		RomanToInteger obj = new RomanToInteger();

		Scanner sc = new Scanner(System.in);

		System.out.println("Roman number is : ");

		String romanNumber = sc.nextLine();

		convertRomanToInteger(romanNumber);

		// System.out.println("Its integer value is :
		// "+convertRomanToInteger(romanNumber));
	}

	static int Value(char rom) {

		if (rom == 'I')

			return 1;

		if (rom == 'V')

			return 5;

		if (rom == 'X')

			return 10;

		if (rom == 'L')

			return 50;

		if (rom == 'C')

			return 100;

		if (rom == 'D')

			return 500;

		if (rom == 'M')

			return 1000;

		return -1;
	}

	public static int convertRomanToInteger(String romanNumber) {

		int total = 0;

		for (int i = 0; i < romanNumber.length(); i++)
			

		{
		
			int s1 = Value(romanNumber.charAt(i));
			if ((i + 1) < romanNumber.length()) {
				int s2 = Value(romanNumber.charAt(i + 1));
				if (s1 >= s2) {

					total = s1 + total;

				} else {

					total = total - s1;

				}
			} else

				total = s1 + total;

		}

		return total;
	}
}