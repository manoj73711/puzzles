package com.manoj.puzzle.equilibriumArray;

public class EquilibriumArray {

	public int middleIndexEqualHalf(int[] a) {
		int sum = 0;
		int fsum = 0;
		for (int temp : a)
			sum = sum + temp;

		for (int i = 0; i < a.length; i++) {
			sum = sum - a[i];
			if (fsum == sum)
				return i;
			fsum = fsum + a[i];

		}
		return 0;
	}

	public static void main(String[] args) {
		EquilibriumArray a = new EquilibriumArray();
		System.out.println(a.middleIndexEqualHalf(new int[] { -7, 1, 5, 2, -4, 3, 0 }));

	}
}
