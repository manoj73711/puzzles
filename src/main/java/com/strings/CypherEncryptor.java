package com.strings;

public class CypherEncryptor {

	public static String getCypherText(String str, int key) {

		StringBuilder s = new StringBuilder();

		int newkey = key % 26;

		int i = 96;
		int j = 122;

		for (int k = 0; k < str.length(); k++) {

			int value = (int) str.charAt(k) + newkey;

			if (value > 122) {

				value = (i + value) % j;
			}

			s = s.append((char) value);
		}

		return s.toString();
	}

	public static void main(String[] args) {

		System.out.println(getCypherText("abc", 2));
	}

}
