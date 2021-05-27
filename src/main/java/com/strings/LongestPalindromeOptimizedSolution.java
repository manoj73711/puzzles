package com.strings;

public class LongestPalindromeOptimizedSolution {

	// aabbac

	public static String longestPalindromicSubstring(String s) {
		int[] currentLongest = new int[] { 0, 1 };

		for (int i = 1; i < s.length(); i++) {

			int[] odd = getLongestpalindrome(s, i - 1, i + 1);
			int[] even = getLongestpalindrome(s, i - 1, i);
			int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;

			currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;

		}

		return s.substring(currentLongest[0], currentLongest[1]);

	}

	public static int[] getLongestpalindrome(String s, int leftIndex, int rightindex) {

		while (leftIndex >= 0 && rightindex < s.length()) {

			if (s.charAt(leftIndex) != s.charAt(rightindex)) {
				break;
			}
			leftIndex--;
			rightindex++;
		}

		return new int[] { leftIndex + 1, rightindex };

	}

}
