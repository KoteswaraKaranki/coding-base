package org.karanki.coding.algoexpert;

public class Subsequence {

	public static boolean validSubsequence(int [] arr, int [] seq) {
		
		int arrIdx = 0, seqIdx = 0;
		while(arrIdx < arr.length && seqIdx < seq.length) {
			if(seq[seqIdx] == arr[arrIdx]) {
				seqIdx++;
			}
			arrIdx++;
		}
		
		return seqIdx == seq.length ;
	}
}
