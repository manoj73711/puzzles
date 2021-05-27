package com.strings;

import java.util.HashMap;
import java.util.Map;

public class StringCharactetCunt {
	
	public static void main(String[] args) {
		
		System.out.println(generateDocument("aheaolabbhb", "hello"));
	}
	
	public static boolean generateDocument(String characters, String document) {
	    // Write your code here.
			
			Map<Integer, Integer> cmap = populateMapWithCharacers(characters, new HashMap<Integer, Integer>());
			Map<Integer, Integer> dmap = populateMapWithCharacers(document, new HashMap<Integer, Integer>());

			for(Map.Entry<Integer, Integer> docSet: dmap.entrySet()){
				
				int docCharacter = docSet.getKey();
				if(cmap.get(docCharacter) ==null || !(docSet.getValue() <= cmap.get(docCharacter))){
					return false;
				}
			}
			
	    return true;
	  }
		
		public static Map<Integer, Integer> populateMapWithCharacers(String string, Map<Integer, Integer> hash_map){
			
			for(int i = 0 ; i<string.length(); i++){
				
				Integer charac = (int) string.charAt(i);
				
				if( hash_map.containsKey(charac)){
					Integer count = hash_map.get(charac)+1;
					hash_map.put(charac,count);
				}
				else{
					hash_map.put(charac,1);
				}
				
			}
			
			return hash_map;
		}
		

}
