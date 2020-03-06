package com.manoj.puzzle.easy;

//remove the vowels from a string
public class RemoveVowels {
        
    public String removeVowels(String s) {
        
        char[] va = {'a','e','i','o','u'};
            
        StringBuilder sb = new StringBuilder("");
        for(int i =0 ; i<s.length(); i++){
            
            boolean vowelFound = false;
            
               for (int j =0;j<va.length;j++){
                   
                   if(s.charAt(i)==va[j]){
                       vowelFound = true;
                   }   
               }
            if(!vowelFound){
                sb.append(s.charAt(i));
            }
            
        }
                     
                     return sb.toString();
        
    }
    }
