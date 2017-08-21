package com.manoj.puzzle.arrayEvenOdd;

public class ArrayEvenOdd {
	public int[] sortEvenOdd(int[] a) {
		int first = 0;
		int last = a.length - 1;
		while (first < last) {
			while (a[first] % 2 == 0 && first < last) {
				first++;
			}

			while (a[last] % 2 == 1 && first < last) {
				last--;
			}
			if (first < last) {
				int temp = a[first];
				a[first] = a[last];
				a[last] = temp;
				first++;
				last--;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		ArrayEvenOdd a = new ArrayEvenOdd();
		int[] b = { 2, 5, 9, 1, 6, 4, 3 };
		int[] c = a.sortEvenOdd(b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
