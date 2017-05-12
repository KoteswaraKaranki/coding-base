package org.karanki.coding.sort;

import java.util.Arrays;

public class BubbleSortPractice {

	
	public void sort(int []a) {
		
		boolean swapped = true;
		
		for(int i = a.length -1; i >= 0 && swapped; i--) {							
			swapped = false;
			for(int j = 0;  j < i; j++) {							
				if(a[j] > a[j+1]) {
					SortUtil.swap(a, j, j+1);
					swapped = true;
				}				
			}									
		}		
	}
	

	
	public static void main(String[] args) {		
		
		BubbleSortPractice sort = new BubbleSortPractice();
		
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
