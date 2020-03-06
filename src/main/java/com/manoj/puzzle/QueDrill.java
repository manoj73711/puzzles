package com.manoj.puzzle;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class QueDrill {
	
	public static void main(String[] args) {
		
		Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
		
		PriorityQueue<Integer> p= new PriorityQueue<Integer>(Comparator.naturalOrder());
		
		
		p.add(12);
		p.add(11);
		
		  int sum = p.stream().mapToInt(k-> k.intValue()).sum();
		  System.out.println(sum);
	}

}
