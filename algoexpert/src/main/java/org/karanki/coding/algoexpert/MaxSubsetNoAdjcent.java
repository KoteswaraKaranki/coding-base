package org.karanki.coding.algoexpert;

public class MaxSubsetNoAdjcent {

	static public int max(int array[]) {
		int current = 0, prev = 0, prevToPrev = 0;
		prev = Math.max(array[0], array[1]);
		prevToPrev = array[0];
		for(int idx = 2; idx < array.length; idx++) {
			current = Math.max(prev, prevToPrev + array[idx]);
			prevToPrev = prev;
			prev = current;
		}
		return current;
	}
	
	
	public static void main(String[] args) {
		System.out.println(max(new int[]{7,10,12,7,9,14}));
	}

}
