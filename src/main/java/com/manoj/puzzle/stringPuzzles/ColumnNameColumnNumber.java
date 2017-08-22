package com.manoj.puzzle.stringPuzzles;

public class ColumnNameColumnNumber {
	public final static char[] al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public String calString(int x) {
		String s = "";

		while (x > 0) {
			int y = x % 26;
			if (y == 0) {
				s = s + al[y - 1];
				x = (x / 26) - 1;
			} else {
				s = s + al[y - 1];
				x = x / 26;
			}
		}
		char[] c = s.toCharArray();
		int length = c.length / 2;
		for (int i = 0; i < length; i++) {
			char temp = c[i];
			c[i] = c[c.length - 1];
			c[c.length - 1] = temp;
		}
		return String.valueOf(c);

	}

	public static void main(String[] args) {
		ColumnNameColumnNumber c = new ColumnNameColumnNumber();
		System.out.println(c.calString(28));
		System.out.println((al[3 - 1]));
	}

}