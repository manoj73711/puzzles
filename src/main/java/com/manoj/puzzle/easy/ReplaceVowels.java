package com.manoj.puzzle.easy;

public class ReplaceVowels {
		
	 public String reverseVowels(String s) {
		 
		 
	        
	        
	        StringBuilder sb = new StringBuilder(s);
	        char[] v = {'a','e','i','o','u'};
	        
	        
	        int lastindex=sb.length()-1;

	        
	        for(int i =0; i <sb.length(); i++){
	            
	            boolean isVowelF= false;
	            
	            for(int j=0;j<v.length;j++){
	                
	                if(sb.charAt(i)==v[j]){
	                    isVowelF = true;
	                }
	            }
	            
	            if(!isVowelF){
	                continue;
	            }
	                
	            for(int k=lastindex;k>i; k--){
	                    boolean isVowelS = false;
	                    for(int j=0;j<v.length;j++){
	                
	                        if(sb.charAt(k)==v[j]){
	                             isVowelS = true;
	                        }
	                     }     
	                 if(isVowelS && isVowelF){
	                        char temp = sb.charAt(i);
	                        sb.setCharAt(i,sb.charAt(k));
	                        sb.setCharAt(k,temp);
	                        isVowelS =false;
	                        isVowelF = false;
	                        lastindex = k-1;
	                
	            }
	                
	            }
	           
	            
	        }
	        return sb.toString();
	        
	    }

}
