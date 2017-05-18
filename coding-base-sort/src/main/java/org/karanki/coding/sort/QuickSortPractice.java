package org.karanki.coding.sort;

import java.util.Arrays;

public class QuickSortPractice {

	public static void sort(int[] a, int start, int end) {
		
		if(start >= end) return;
		
		int pivotIndex = pivot(a, start, end);
		sort(a, start, pivotIndex - 1);
		sort(a, pivotIndex + 1, end);		
	}
	
	
	private static int pivot(int a[], int start, int end) {
		
		int pIndex = start;
		int pivot = a[end];
		
		for(int i = start; i < end; i++) {
			
			if(a[i] <= pivot) {
				int tmp = a[i];
				a[i] = a[pIndex];
				a[pIndex++] = tmp;
			}			
		}
		
		//swap the pivot
		int tmp = a[end];
		a[end] = a[pIndex];
		a[pIndex] = tmp;
		
		return pIndex;
	}
	
	public static void main(String[] args) {
		
		int[] a = {9, 5, 0, 2, 6, 3, 7, 8, 1, 4};
		System.out.println("Before sort " + Arrays.toString(a));
		sort(a, 0, a.length -1);
		System.out.println("Before sort " + Arrays.toString(a));

	}

}
