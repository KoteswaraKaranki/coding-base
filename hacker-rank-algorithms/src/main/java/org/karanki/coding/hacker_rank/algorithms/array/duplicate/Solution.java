package org.karanki.coding.hacker_rank.algorithms.array.duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	
	static public Integer[] removeDuplicates(int []a) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < a.length; i++) {			
			if(set.contains(a[i])){				
				a[i] = Integer.MIN_VALUE;
			}
			else {
				set.add(a[i]);
			}
		}
		
		return set.toArray(new Integer[a.length]);
		
	}
	public static void main(String[] args) {
		
		int []a =  {1, 2, 3, 4, 3, 5, 6, 2, 7, 8, 9, 10, 3, 4, 5, 6};
		System.out.println( Arrays.toString(removeDuplicates(a)));

	}

}
