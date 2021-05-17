package com.strings;

public class CheckPallindrome {

	public static boolean checkPallindromeSolution1(String s) {

		for (int i = 0; i < s.length(); i++) {

			if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {

				return false;
			}
		}

		return true;
	}

	//o(n) | o(1)
	public static boolean checkPallindromeSolution2(String s) {
		
		int i = 0;
		int j = s.length()-1-i;
		
		while(i<j) {
			
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j++;
		}
		
		return true;
	
	}

	public static void main(String[] args) {

		System.out.println(checkPallindromeRecursion("abtba"));
	}

	// recursion problem
	public static boolean checkPallindromeRecursion(String s) {

		return checkPallindromeRecursion(s, 0);
	}

	public static boolean checkPallindromeRecursion(String s, int i) {

		int j = s.length() - 1 - i;

		return i > j ? true : s.charAt(i) == s.charAt(j) && checkPallindromeRecursion(s, i + 1);

	}

}
