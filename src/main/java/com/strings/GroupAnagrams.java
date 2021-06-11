package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("yo");
		list.add("oy");
		
		
		System.out.println(groupAnagrams(list));
		
	}
	
public static List<List<String>> groupAnagrams(List<String> words) {
		
		List<List<String>> results = new ArrayList<List<String>>();
		Map <String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
		
		for(String word: words){
			
			//String sortedWord = Stream.of(word.split("")).sorted().collect(Collectors.joining());
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			
			String sortedWord = String.valueOf(chars);
			HashSet<String> list = map.getOrDefault(sortedWord, new HashSet<String>());
			list.add(word);
			map.put(sortedWord, list);
		}
		
		for(Map.Entry<String, HashSet<String>> entry : map.entrySet()){
			
			HashSet<String> set = entry.getValue();
			List<String> list = new ArrayList();
			for(String s : set) {
				list.add(s);
			}
			results.add(list);
		}
		
    return results;
  }
}
