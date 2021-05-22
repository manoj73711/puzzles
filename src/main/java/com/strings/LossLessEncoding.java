package com.strings;

public class LossLessEncoding {

	// ip - AAAAAAAAAAAABBBCC1D
	// op - 9A3B2C111D

	public static void main(String[] args) {
		System.out.println(runLossLessCompression("AABBCCCCDD"));
	}

	//This is an optimized solution with o(1)- space complexity and o(n) - time complexity
	public static String runLossLessCompression(String string) {

		StringBuilder result = new StringBuilder();

		int currentRunLength = 1;
		for (int i = 1; i < string.length(); i++) {

			char currentCharacter = string.charAt(i);
			char previousCharacter = string.charAt(i - 1);

			if ((currentCharacter != previousCharacter) || (currentRunLength >= 9)) {

				result.append(String.valueOf(currentRunLength));
				result.append(previousCharacter);
				currentRunLength = 0;
			}
			currentRunLength += 1;

		}

		result.append(String.valueOf(currentRunLength));
		result.append(string.charAt(string.length() - 1));

		return result.toString();
	}

	public static String runLengthEncodingBruteForceSolution(String string) {
		// Write your code here.

		if (string.trim().length() == 1) {
			return string;
		}

		StringBuilder result = new StringBuilder();

		int count = 1;

		for (int i = 0; i < string.length(); i++) {

			if (i == string.length() - 1) {
				if (count >= 1) {
					result.append(count);
				}
				result.append(string.charAt(i));
			} else if (string.charAt(i) == string.charAt(i + 1)) {

				if (count >= 9) {
					result.append(String.valueOf(count)).append(string.charAt(i));
					count = 1;
					continue;
				}
				count = count + 1;
			}

			else if (string.charAt(i) != string.charAt(i + 1)) {
				if (count >= 1) {
					result.append(count);
				}
				result.append(string.charAt(i));
				count = 1;
			}

		}
		return result.toString();
	}

}
