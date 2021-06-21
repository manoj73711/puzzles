package com.toolkit;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*This class is a reference for some java methods like a tool kit*/
public class JavaToolKit {
	
	public static void main(String[] args) {
		
		//char[] charArray = s.toCharArray();
		
		//Strings and characters tool kit
		//1. To sort the string in java
		String abcd = "bdca";
	    char[] chars = abcd.toCharArray();

	    Arrays.sort(chars);
	    String sorted = new String(chars);
	    String sorted1 =
	    	    Stream.of("edcba".split(""))
	    	        .sorted()
	    	        .collect(Collectors.joining());
	    
	    String s = Stream.of("aetgerg","").sorted().collect(Collectors.joining());
	    
	    //Math.min((int)s.length(),4)
	    
	    //Tip 2
	    //			ipAddress[0] = s.substring(0,i);
	    
	    //Collections.reverse(al); // learn how to introduce comparator in java for custome sorting
	    
	    //String.join("",al); al - array list to join all the list objects to a string
	    
//	    public static char[] reverseListRange(char[] charArray, int startIdx, int endIdx){
//			
//			while(startIdx<endIdx){
//				
//				char temp = charArray[startIdx];
//				charArray[startIdx] = charArray[endIdx];
//				charArray[endIdx] = temp;
//				startIdx += 1; 
//				endIdx -= 1;
//			}
//			
//			return charArray;
//		}
//		

	    //String[] strings = list.toArray(String[]::new);
	}

}
