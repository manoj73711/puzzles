package com.manoj.puzzle.easy;
/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice*/
public class TwoNumbersAddUpTarget {
public int[] twoSum(int[] nums, int target) {
        
        
        for(int i =0; i <nums.length; i++){
            
            
            for(int j=0;j<nums.length;j++){
                
                if(i==j){
                    continue;
                }   
                
                if(nums[i]+nums[j]==target){
                    
                    return new int[]{i,j};
                }
            }
        }
        
        return null;
        
    }
    
}
