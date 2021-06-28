package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MinimumAreaRectangle {
	
	  public int minimumAreaRectangle(int[][] points) {
	    // Write your code here.
			TreeMap<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
			int maxArea = Integer.MAX_VALUE;
			boolean anyRectangleFound = false;
			for(int i = 0; i < points.length; i++){
				
				int[] p1 = points[i];
				List<Integer> list = null;
				
				if(map.containsKey(p1[0])){
					
					list = map.get(p1[0]);
					list.add(p1[1]);
				}
				else{
					
					list = new ArrayList<Integer>();
					list.add(p1[1]);
					map.put(p1[0],list);
				}
			}
			Map<String, Integer> mp = new TreeMap<String, Integer>();
			
			for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
				
				Integer newX = entry.getKey();
				List<Integer> st = entry.getValue();
				Collections.sort(st);
				
				for(int idx = 0; idx < st.size(); idx++){
					
					int yLowerIndex = st.get(idx);
					for(int iidx = idx+1; iidx < st.size(); iidx++){
						
						int yUpperIndex = st.get(iidx);
						
						//form hashkey
						
						String key = String.valueOf(yLowerIndex)+":"+String.valueOf(yUpperIndex);
						
						if(mp.containsKey(key)){
							int oldX = mp.get(key);
							
							//calculate area and find if this is the least one
							
							int area = Math.abs((newX-oldX)*(yUpperIndex -yLowerIndex));
							
							if(area < maxArea){
								maxArea = area;
								anyRectangleFound = true;
							}
							
						}
						
						mp.put(key, newX);
					}
				}
			}
			
			
	    return anyRectangleFound ? maxArea: 0;
	  }
	}

