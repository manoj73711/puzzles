package com.toolkit;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*This class is a reference for some java methods like a tool kit*/
public class JavaToolKit {
	
	public static void main(String[] args) {
		
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
	    
	    //Tip 2
	    //			ipAddress[0] = s.substring(0,i);

	}

}
