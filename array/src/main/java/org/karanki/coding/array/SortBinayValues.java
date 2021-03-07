package org.karanki.coding.array;

import java.util.Arrays;

//01010010011110001111
public class SortBinayValues {

	
	public static int[] sort(int[] A) {
		
		if(A == null || A.length == 0) {
			return A;
		}
		
		int leftIdxPosition = 0; 
		int rightIdxPosition = A.length - 1;
		
		while(leftIdxPosition < rightIdxPosition) {
			
			if(A[leftIdxPosition] == 1 && A[rightIdxPosition] == 0) {
				A[leftIdxPosition++] = 0;
				A[rightIdxPosition--] = 1;
				continue;
			}
			
			
			if(A[leftIdxPosition] == 0) {
				leftIdxPosition++;
			}
			
			if(A[rightIdxPosition] == 1) {
				rightIdxPosition--;
			}
			
		}
	
		return A;
	}
	
	
	public static void main(String[] args) {
		
		int[] A = {1, 0,1,0,1,0,0,1,0,0,1,1,1,1,0,0,0,1,1,1,1, 0};
		System.out.println(Arrays.toString(sort(A)));

	}

}
