package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSuM {
	
	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
	    // Write your code here.
			
		var i = 9;
		
			Arrays.sort(array);
			Arrays.asList(a)
			
			List<Integer[]> list = new ArrayList<Integer[]>();
			
			for(int i = 0; i < array.length; i ++){
				
				int leftPointer = i+1;
				int rightPointer = array.length-1;
				
				while(leftPointer<rightPointer){
					int estimatedSum = array[i]+array[leftPointer]+array[rightPointer];
					if(estimatedSum < targetSum){
						leftPointer++;
					}
					else if(estimatedSum > targetSum){
						rightPointer--;
					}
					else{
						list.add(new Integer[]{array[i], array[leftPointer], array[rightPointer]});
					}
				}
				//Integer.
				Arrays.
				
			}
	    return list;
	  }
	
	public static void main(String[] args) {
		System.out.println(threeNumberSum(new int[]{1,2,3,4,5}, 8));
		

}
}
