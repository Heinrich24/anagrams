package com.heinrich24;

import java.util.Scanner;

public class MyMain {

	/*
	 * Anagram function to check if two strings are similar from a character
	 * frequency point of view.
	 */
	static boolean isAnagram(String a, String b) {
		// To get a good working set lets make all the cases the same.
		String aUpperCase = a.toUpperCase();
		String bUpperCase = b.toUpperCase();

		// Lets leverage the Stream API to sort the String for us
		String aSorted = aUpperCase.chars().sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		String bSorted = bUpperCase.chars().sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		/*
		 * Now we check to see if the two string are the same. If they are the same we
		 * return true else return false if they are not the same
		 */
		if (aSorted.equalsIgnoreCase(bSorted)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Please input two string variables and proceed by submitting enter");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}

}
