package org.karanki.coding.algoexpert.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

	
	 public static int[] twoNumberSum(Integer[] array, int targetSum) {
		    
		
		 
		 Map<Integer, Integer> map = new HashMap<>();
		 
		 for(int i = 0; i < array.length; i++) {			 
			map.put(array[i], i);
		 }
		 
		 for(int i = 0; i < array.length; i++) {
			 
			 Integer otherValue = targetSum - array[i]; //actual value
			 Integer otherIndex = map.get(otherValue); //actual index
			 
			 if(otherIndex != null && otherIndex != i) {
				 
				 return (otherIndex < i ? new int[]{otherValue, array[i]} : new int[]{array[i], otherValue} )  ;
			 }
		 }
		 
		 return new int[]{};
		 
	  }
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(TwoNumberSum.twoNumberSum(new Integer[]{3,5,-4,8,11,1,-1,6}, 10)));
		System.out.println(Arrays.toString(TwoNumberSum.twoNumberSum(new Integer[]{1,2,3,4,5,6,7,8,9}, 17)));
		System.out.println(Arrays.toString(TwoNumberSum.twoNumberSum(new Integer[]{-7,-5,-3,-1,0,1,3,5,7}, -5)));
	}

}
