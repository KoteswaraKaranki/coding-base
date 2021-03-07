package org.karanki.coding.algoexpert;

import java.util.Arrays;

public class BubbleSort {

	
	public  int[] sort(int []A) {
		
		for(int i = 0; i < A.length-1; i++) {
			int cntr = A.length - 1;
			for(int j = 0; j < cntr; j++) {
				if(A[j] > A[j+1]) {
					A[j]   =  A[j] ^ A[j+1];
					A[j+1] =  A[j] ^ A[j+1];
					A[j]   =  A[j] ^ A[j+1];
				}
			}
			cntr--;
		}
		return A;
	}
	
	
	public static void main(String[] args) {
		
		/*
		//swp using XOR
		int x = 10;
		int y = 20;
		
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.print("X :: " + x +  ", Y :: " + y);
		*/
		
		BubbleSort sort = new BubbleSort();
		
		int[] a1 = {10, 5, 4, 13, 25, 0, 2, 12, 1};
		System.out.println("Before Sort : " + Arrays.toString(a1));
		sort.sort(a1);
		System.out.println("After Sort : " + Arrays.toString(a1));				
		System.out.println("----------------------------------------");
		
		int[] a2 = {1, 2 ,3, 4, 5, 6, 7, 8, 9};
		System.out.println("Before Sort : " + Arrays.toString(a2));
		sort.sort(a2);
		System.out.println("After Sort : " + Arrays.toString(a2));
		System.out.println("----------------------------------------");		
		
		int[] a3 = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 0};
		System.out.println("Before Sort : " + Arrays.toString(a3));
		sort.sort(a3);
		System.out.println("After Sort : " + Arrays.toString(a3));
		
	}

}
