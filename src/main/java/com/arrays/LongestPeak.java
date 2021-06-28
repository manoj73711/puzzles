package com.arrays;

public class LongestPeak {

	public static int longestPeak(int[] array) {
	    // Write your code here.
			
			int highestPeakLength = 0;
			for(int i =1; i < array.length-1; i++){
				
				//find the peak
				if(array[i]>array[i-1] && array[i] < array[i+1]){
					continue;
				}
				
				else if(array[i]>array[i-1] && array[i] > array[i+1]){
					
					//found peak
					int peak = i;
					
					
					//find the length of the peak
					int[] lenAndIndex = getLengthOfPeak(i,array);
					
					if(lenAndIndex[0] >highestPeakLength){
						highestPeakLength = lenAndIndex[0];
					}
					 
					i = lenAndIndex[1];
					//swap the current peak length if highest
					
				}
				
			}
	    return highestPeakLength;
	  }
		
		public static int[] getLengthOfPeak(int arrayIndex, int[] array ){
			
			int left = arrayIndex;
			int right = arrayIndex;
			
			while(left>0){
				
				if(array[left] < array[left-1]){
					break;
				}
				left--;
			}
			
			while(right+1< array.length){
				
				if(array[right] < array[right+1]){
					break;
				}
				right++;
			}
			
			arrayIndex = right;
			
			return new int[]{right-left+1, arrayIndex};
		}
}
