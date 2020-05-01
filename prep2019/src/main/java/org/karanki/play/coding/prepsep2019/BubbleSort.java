package org.karanki.play.coding.prepsep2019;

import java.util.Arrays;

public class BubbleSort {

	public static int[] sort(int []A) {
		
		int last = A.length-1;
		boolean swapped = false;
		
		for(int i = last; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if(A[j] > A[j+1]) {
					A[j] =   A[j] ^ A[j+1];
					A[j+1] = A[j] ^ A[j+1];
					A[j] =   A[j] ^ A[j+1];
					swapped = true;
				}
			}
			if(!swapped)
				break;
			last--;
		}
		
		return A;
	}
	
	public static int[] sort_REC(int []A, int arraySize) {
		
		if(arraySize == 0)
			return A;
		
		boolean swapped = false;
		
		for(int i = 0; i < arraySize - 1; i++) {
			if(A[i] > A[i+1]) {
				A[i]   = A[i] ^ A[i+1];
				A[i+1] = A[i] ^ A[i+1];
				A[i]   = A[i] ^ A[i+1];
				swapped = true;
			}
		}
		
		if(!swapped) {
			return A;
		}
		else {
			return sort_REC(A, arraySize - 1);
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(BubbleSort.sort(new int[]{8, 5, 9, 3, 2, 4, 12, 6, 25, 1, 7, 10})));
		System.out.println(Arrays.toString(BubbleSort.sort(new int[]{1,2,3,4,5,6,7,8,9,10})));
		
		System.out.println(Arrays.toString(BubbleSort.sort_REC(new int[]{8, 5, 9, 3, 2, 4}, 6)));
		System.out.println(Arrays.toString(BubbleSort.sort_REC(new int[]{8, 5, 9, 3, 2, 4, 12, 6, 25, 1, 7, 10}, 12)));
		System.out.println(Arrays.toString(BubbleSort.sort_REC(new int[]{1,2,3,4,5,6,7,8,9,10}, 10)));
		
	}

}
