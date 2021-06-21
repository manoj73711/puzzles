package com.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinCharactersForWord {

public char[] minimumCharactersForWords(String[] words) {
		
		HashMap<Character, Integer> resultMap = new HashMap<>();
		
		for(int i = 0; i < words.length; i++){
			
			String word = words[i];
			HashMap<Character, Integer> map = new HashMap<>();
			
			for(int j = 0; j< word.length(); j++){
				
				Character character = word.charAt(j);
				
				map.put(character, map.getOrDefault(character, 0)+1);
				
			}
			
			for(Map.Entry<Character, Integer> entry: map.entrySet()){
				
				Character c = entry.getKey();
				Integer charCount = entry.getValue();
				
				if(resultMap.containsKey(c) && resultMap.get(c) >= charCount){
					continue;
				}
				
				resultMap.put(c,charCount);
				
			}	
			
		}
		
		List<Character> list = new ArrayList<>();
		
		for(Map.Entry<Character, Integer> entry: resultMap.entrySet()){
			
			int count = 0;
			while(count<=entry.getValue()){
				list.add(entry.getKey());
				count++;
			}
			
		}
		
		char[] charArray = new char[list.size()];
		
		for(int i =0; i <list.size(); i++) {
			
			charArray[i] = list.get(i);
		}
			return charArray;

	}
}
