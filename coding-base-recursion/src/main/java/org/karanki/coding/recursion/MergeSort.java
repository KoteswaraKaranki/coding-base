package org.karanki.coding.recursion;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int [] a, int start, int end) {
				
		if(start >= end) {		
			return;
		}
		
		int middle = (start + end) / 2;
		
		mergeSort(a, start, middle);
		mergeSort(a, middle + 1, end);		
		merge(a, start, end);
		
	}
		
	public static void merge(int[] a, int start , int end) {
	
		int leftEnd  = (start + end) /2;		
		int rightStart = leftEnd + 1;
		int size =  end - start + 1;
		
		int left = start;
		int right = rightStart;
		
		int index = start;
		
		int[] tmp = new int[a.length];
		
		while(left <= leftEnd && right <= end) {
			
			if(a[left] <= a[right]) {
				tmp[index] = a[left];
				left++;
			}
			else {
				tmp[index] = a[right];
				right++;
			}
			
			index++;
		}
		
		System.arraycopy(a, left, tmp, index, leftEnd-left+1);
		System.arraycopy(a, right, tmp, index, end-right+1);
		System.arraycopy(tmp, start, a, start, size);
				
	}
	
	public static void main(String[] args) {
	
		int[] a = {9, 5, 0, 2, 6, 3, 7,  1};
		System.out.println("Before sort " + Arrays.toString(a));
		mergeSort(a, 0, a.length -1);
		System.out.println("Before sort " + Arrays.toString(a));
		
	}

}
