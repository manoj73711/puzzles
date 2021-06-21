package com.strings;

import java.util.HashMap;

public class LongestSubstring {
	public static String longestSubstringWithoutDuplication(String str) {
	    
		int[] longest = {0,1};
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int startIdx = 0;
		
		for ( int i = 0; i < str.length(); i++ ) {
			
			Character c = str.charAt(i);
			if(map.containsKey(c)){
				startIdx =Math.max(c, map.get(c)+1);
			}
			
			if(longest[1]-longest[0] < i + 1 - startIdx){
				
				longest[0] = startIdx;
				longest[1] = i+1;
			}
			
			map.put(c,i);
		}
		
		String result = str.substring(longest[0], longest[1]);
		return result;
		
  }

	
	public static void main(String[] args) {
		
		longestSubstringWithoutDuplication("clementisacap");
	}
}
