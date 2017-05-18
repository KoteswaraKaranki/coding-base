package org.karanki.coding.hacker_rank.algorithms.greedy.min_abs_difference;

import java.util.Scanner;

/**
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2016
 * 
 * @see <a href=
 *      "https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array">
 *      		https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array
 *      </a>
 *
 */

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		
		// O(n2) time complexity
	/*	int min = Integer.MAX_VALUE;	 
		int tmp;		
		for(int i = 0; i < a.length; i++) {			
			for(int j = i + 1; j < a.length; j++ ) {				
				tmp = Math.abs(a[i]- a[j]); 
				if( tmp < min) {
					min = tmp; 
				}
			}
		}*/
		
		mergeSort(a, 0, a.length - 1);
		int min = Integer.MAX_VALUE;	
		int tmp;
		for(int i = 0; i < a.length - 1; i++) {
			tmp = Math.abs(a[i] - a[i+1]); 
			if(tmp < min) {				
				min = tmp;
			}		
		}
		
		System.out.print(min);
		
		in.close();
		
	/*	int a[] = {5, 8, 1, 9, -1, -4, 2, 3, 6,  -10, 7, 4, 0};
		mergeSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));*/
		
		
	}
	
	private static void mergeSort(int []a, int start, int end) {
	
		if(start >= end) {			
			return;
		}
		
		int mid = (start + end) / 2;
		mergeSort(a, 0, mid);
		mergeSort(a, mid + 1, end);
				
		merge(a, start, end);
	}

	private static void merge(int[] a, int start, int end) {
		
		int len = (end - start) + 1;
		
		int ls = start;
		int le = (end + start) / 2;
		int rs = le + 1;
		
		int tmp[] = new int[len];
		int ti = 0;
		
		
		while(ls <= le && rs <= end) {
			
			if(a[ls] <= a[rs]) {				
				tmp[ti++] = a[ls++];
			}
			else {
				tmp[ti++] = a[rs++];
			}
		}
		
		//System.arraycopy(a, ls, tmp, ti, le - ls + 1);
		//System.arraycopy(a, rs, tmp, ti, end - rs + 1);	
		//System.arraycopy(tmp, 0, a, start, len);
		
		
		while(ls <= le) {
			tmp[ti++] = a[ls++];
		}
		
		while(rs <= end) {
			tmp[ti++] = a[rs++];
		}
		
		for(int i = 0; i < tmp.length; i++) {
			a[start++] = tmp[i];
		}
		
		
	}
}