package com.strings;

public class LongestPalindromeSubstring {
	
	
	
	public static void main(String[] args) {
		
		System.out.println(longestPalindromicSubstring("abcdefghfedcbaa"));
		
	//	a-0 b-1 c-2 d-3 e-4 f-5 g-6 h-7 f-8 e-9 d-10 c-11 b-12 a-13 a-14
		
		
		
		
	}
	public static String longestPalindromicSubstring(String str) {
	    // Write your code here.
			
			String longestPalindromString = "";
			
			if(str.length() == 1){
				
				return str;
			}
			
			firstForloop:
			for(int j = str.length()-1; j>0; j--){
				
				
				innerForLoop:
				for(int i =0; i<j;i++){
					int tempI =i;
					int tempJ = j;
					
					
					while(tempI < tempJ){
						
						if(str.charAt(tempI) != str.charAt(tempJ)){
							 continue innerForLoop;
						}
						
						tempI++; tempJ--;
						
					}
					
					
					if(str.substring(i,j+1).length() > longestPalindromString.length()){
						longestPalindromString = str.substring(i,j+1);
					}
				}
				
			}
	    return longestPalindromString;
	  }
}
