package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public int firstNonRepeatingCharacterOriginalSolution(String string) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		// avvccaat
		for (int i = 0; i < string.length(); i++) {

			Character c = string.charAt(i);

			map.put(c, map.getOrDefault(c,0)+1);
			
		}

		for (int i = 0; i < string.length(); i++) {
			Character c = string.charAt(i);
			if (map.get(c) == 1) {
				return i;
			}
		}

		return -1;

	}

	public int firstNonRepeatingCharacterMySolution(String string) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		// avvccaat
		for (int i = 0; i < string.length(); i++) {

			Character c = string.charAt(i);

			map.put(c, map.getOrDefault(c,0)+1);
		}

		for (int i = 0; i < string.length(); i++) {
			Character c = string.charAt(i);
			if (map.get(c) == 1) {
				return i;
			}
		}

		return -1;

	}

}
