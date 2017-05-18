package org.karanki.coding.hacker_rank.algorithms.array.missing_number;

import java.util.BitSet;

public class Solution {

	
	public static void printMissingNumbers(int []a, int len) {
		
		BitSet bs = new BitSet(len);
		
		for(int n : a) {
			bs.set(n -1);			
		}
		
		int missingIndex = 0;
		while(missingIndex < len - 1) {
			int cIdx = bs.nextClearBit(missingIndex);
			System.out.println( cIdx + 1);
			missingIndex = cIdx + 1;			
		}
	}
	
	public static void printOneMissingNo(int []a) {
		
		int actualSum = 0;
		
		for(int i = 0; i < a.length; i++) {
			actualSum += a[i];
		}
		
		int expectedSum = ((a.length + 1) * (a.length + 2)) / 2;
								
		System.out.println(expectedSum - actualSum);
	}
	
	public static void main(String[] args) {
		
		int a[] =  {1, 2, 3, 4, 6, 8, 10};		
		printMissingNumbers(a, 10);
		
		System.out.println("*** ONE NO MISSING ***");
		int b[] =  {1, 2, 3, 4, 5, 6,  8};
		printOneMissingNo(b);

	}

}
