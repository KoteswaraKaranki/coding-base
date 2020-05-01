package org.karanki.coding.search;

import java.util.Arrays;



public class BinarySearchPractice {

	public int indexOf(int []a, int value) {
		
		int mid = a.length / 2;
		int start = 0;
		int end = a.length - 1;

		while(start <= end) {
			
			if( value <  a[mid]) {				
				end = mid -1;
			}
			else if(value > a[mid]) {				
				start = mid + 1;
			}
			else {
				
				return mid;
			}
						
			mid = (start + end) / 2;
			
		}
		
				
		return -1;
	}
	
	public int recursiveindexOf(int []a, int value){		
		return recursiveindexOf(a, value, 0, a.length-1);
	}
	
	private int recursiveindexOf(int []a, int value, int start, int end) {
				
		if(start > end) return -1;
		
		int mid = (start + end) / 2;
		if(value > a[mid]) {			
			return recursiveindexOf(a, value, mid+1, end);
		}
		else if(value < a[mid]) {
			return recursiveindexOf(a, value, start, mid-1);
		}
		else {
			return mid;
		}
				
	}
	
	
	public static void main(String[] args) {

		
		BinarySearchPractice search = new BinarySearchPractice();
		
		int[] a = {0, 1, 2 ,3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("Loop logic");							
		System.out.println("Index Of : 5 for " + Arrays.toString(a) + " is " + search.indexOf(a, 5));						
		System.out.println("----------------------------------------");
				
		System.out.println("Index Of : 1 for " + Arrays.toString(a) + " is " + search.indexOf(a, 1));
		System.out.println("----------------------------------------");		
				
		System.out.println("Index Of : 9 for " + Arrays.toString(a) + " is " + search.indexOf(a, 9));
		System.out.println("----------------------------------------");	
				
		System.out.println("Index Of : 0 for " + Arrays.toString(a) + " is " + search.indexOf(a, 0));
		System.out.println("----------------------------------------");
				
		System.out.println("Index Of : [100] for " + Arrays.toString(a) + " is " + search.indexOf(a, 100));
		System.out.println("----------------------------------------");
		
		
		System.out.println("Recursive logic");
		System.out.println("Index Of : 5 for " + Arrays.toString(a) + " is " + search.recursiveindexOf(a, 5));						
		System.out.println("----------------------------------------");
				
		System.out.println("Index Of : 1 for " + Arrays.toString(a) + " is " + search.recursiveindexOf(a, 1));
		System.out.println("----------------------------------------");		
				
		System.out.println("Index Of : 9 for " + Arrays.toString(a) + " is " + search.recursiveindexOf(a, 9));
		System.out.println("----------------------------------------");	
				
		System.out.println("Index Of : 0 for " + Arrays.toString(a) + " is " + search.recursiveindexOf(a, 0));
		System.out.println("----------------------------------------");
				
		System.out.println("Index Of : [100] for " + Arrays.toString(a) + " is " + search.recursiveindexOf(a, 100));
		System.out.println("----------------------------------------");
		
		
	}

}
