package org.karanki.coding.sort;

import java.util.Arrays;

public class MergeSortPractice2 {

	public void sort(int []a) {
		
		sort(a, 0, a.length-1);
	}
	
	
	private void sort(int []a, int start, int end) {
		
		if(start >= end) return;
		
		int mid = (start + end) / 2;
		sort(a, start, mid); //first half
		sort(a, mid+1, end); // second half
		merge(a, start, end);
		
		
	}
	
	
	private void merge(int[] a, int start, int end) {
		
		int len = end - start + 1;
		int leftIdx = start;
		int mid = (end + start) / 2;		
		int rightIdx = mid + 1;
		int tmpIdx = 0;
		int []tmp = new int[len];
		
		while(leftIdx <= mid && rightIdx <= end) {			
			if(a[leftIdx] <= a[rightIdx]) {				
				tmp[tmpIdx++] = a[leftIdx++];
			}
			else {
				tmp[tmpIdx++] = a[rightIdx++];
			}			
		}
		
		System.arraycopy(a, leftIdx, tmp, tmpIdx, mid-leftIdx+1);
		System.arraycopy(a, rightIdx, tmp, tmpIdx, end-rightIdx+1);
		System.arraycopy(tmp, 0, a, start, len);		
	}
	
	public static void main(String[] args) {
		
		MergeSortPractice2 sort = new MergeSortPractice2();
		
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
