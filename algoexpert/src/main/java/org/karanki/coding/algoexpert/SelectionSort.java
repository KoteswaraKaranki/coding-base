package org.karanki.coding.algoexpert;

import java.util.Arrays;

public class SelectionSort {
	
	public  int[] sort(int []A) {
		for(int i = 0; i < A.length; i++) {
			int minIdx = i;
			for(int j = i; j < A.length; j++) {
				if(A[minIdx] > A[j]) {
					minIdx = j;
				}
			}
			if(minIdx != i) {
				A[i]   =  A[i] ^ A[minIdx];
				A[minIdx] =  A[i] ^ A[minIdx];
				A[i]   =  A[i] ^ A[minIdx];
			}
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
		
		SelectionSort sort = new SelectionSort();
		
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
