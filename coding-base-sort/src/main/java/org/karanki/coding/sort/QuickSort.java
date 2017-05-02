package org.karanki.coding.sort;

import java.util.Arrays;

public class QuickSort {

	
	public static void sort(int []a, int start, int end) {
		
		if(start >= end) return;		
		int pIndex = partition(a, start, end);		
		sort(a, start, pIndex-1);		
		sort(a, pIndex + 1, end);
		
	}
	
	public static int partition(int []a, int start, int end) {
		
		int pivot = a[end];
		int pIndex = start;
		
		for(int i = start; i < end; i++) {
			
			if(a[i] <= pivot) {				
				swap(a, i, pIndex); 				
				pIndex++;
			}
		}
		
		swap(a, pIndex, end);		
		return pIndex;
		
	}
	
	private static void swap(int []a, int sourceIdx, int destIdx) {		
		int tmp = a[sourceIdx];
		a[sourceIdx] = a[destIdx];
		a[destIdx] = tmp;
	}
	
	public static void main(String[] args) {
		
		
		int[] a = {9, 5, 0, 2, 6, 3, 7, 8, 1, 4};
		System.out.println("Before sort " + Arrays.toString(a));
		sort(a, 0, a.length -1);
		System.out.println("Before sort " + Arrays.toString(a));
		
	}
}
