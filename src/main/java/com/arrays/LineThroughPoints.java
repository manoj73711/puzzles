package com.arrays;

import java.util.HashMap;

public class LineThroughPoints {

	public int lineThroughPoints(int[][] points) {
		// Write your code here.

		int maxNumberOfPointsOnline = 1;
		for (int i = 0; i < points.length; i++) {

			HashMap<String, Integer> map = new HashMap<String, Integer>();

			int[] p1 = points[i];

			for (int j = i + 1; j < points.length; j++) {

				int[] p2 = points[j];

				int xdiff = p2[0] - p1[0];
				int ydiff = p2[1] - p1[1];

				int gcd = getGreatestCommonDivisor(Math.abs(xdiff), Math.abs(ydiff));

				xdiff = xdiff / gcd;
				ydiff = ydiff / gcd;

				if (xdiff < 0) {
					xdiff *= -1;
					ydiff *= -1;
				}

				String hashKeySlope = String.valueOf(xdiff) + ":" + String.valueOf(ydiff);

				map.put(hashKeySlope, map.getOrDefault(hashKeySlope, 1) + 1);

				if (map.get(hashKeySlope) > maxNumberOfPointsOnline) {
					maxNumberOfPointsOnline = map.get(hashKeySlope);
				}
			}
		}
		return maxNumberOfPointsOnline;
	}

	public int getGreatestCommonDivisor(int num1, int num2) {

		int a = num1;
		int b = num2;
		while (true) {
			if (a == 0) {
				return b;
			}

			if (b == 0) {
				return a;
			}

			int temp = a;
			a = b;
			b = temp % b;
		}
	}

}
