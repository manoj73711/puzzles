package com.strings;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWords {
	
	 public String reverseWordsInString(String s) {
			
			ArrayList<String> al = new ArrayList<String>();
			
			int startOfWord = 0;
			for ( int i = 0; i<s.length();i++){
				
				char character = s.charAt(i);
				
				if(character == ' '){
					al.add(s.substring(startOfWord,i));
					startOfWord = i;
				}	
				else if(s.charAt(startOfWord) == ' '){
					al.add(" ");
					startOfWord = i;
				}
				
			}
			al.add(s.substring(startOfWord));
			
			Collections.reverse(al);
			
			return String.join("",al);
	    
	  }

}
