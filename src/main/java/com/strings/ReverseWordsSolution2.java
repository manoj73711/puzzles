package com.strings;

public class ReverseWordsSolution2 {
	
public String reverseWordsInString(String s) {
		
		char[] charArray = s.toCharArray();
		reverseListRange(charArray,0,s.length()-1);
		
		int stringStartIdx = 0;
		while(stringStartIdx < s.length()){
			
			int stringEndIdx = stringStartIdx;
			
			while(stringEndIdx<s.length() && charArray[stringEndIdx] != ' '){
				stringEndIdx += 1;
			}
			reverseListRange(charArray, stringStartIdx, stringEndIdx-1 );
			stringStartIdx = stringEndIdx+1;
			
		}
		
		return new String(charArray);
		
	}

	public static char[] reverseListRange(char[] charArray, int startIdx, int endIdx){
		
		while(startIdx<endIdx){
			
			char temp = charArray[startIdx];
			charArray[startIdx] = charArray[endIdx];
			charArray[endIdx] = temp;
			startIdx += 1; 
			endIdx -= 1;
		}
		
		return charArray;
	}
	

}
