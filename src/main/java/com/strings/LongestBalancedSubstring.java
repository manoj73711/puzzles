package com.strings;

import java.util.Stack;

public class LongestBalancedSubstring {

	public int longestBalancedSubstring(String string) {

		int len = 0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);

		for (int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);

			if (c == '(') {
				stack.push(i);
			} else if (c == ')') {
				stack.pop();

				if (stack.isEmpty()) {
					stack.push(i);
					continue;
				}
				int idx = stack.peek();

				if (len < i - idx) {
					len = i - idx;
				}

			}
		}
		// Write your code here.
		return len;
	}
}
