package org.karanki.coding.sort;

import java.util.Arrays;

public class SelectionSortPractice {

	
	public void sort(int a[]) {
		
		
		for(int i = 0; i < a.length; i++) {
			
			int min = i;			
			for(int j = i + 1; j < a.length; j++) {
				
				if(a[j] < a[min]) {
					min = j;
				}
			}
			
			if(i != min) {
				SortUtil.swap(a, i, min);
			}			
		}
				
	}
	
	public static void main(String[] args) {
		
		SelectionSortPractice sort = new SelectionSortPractice();
		
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
