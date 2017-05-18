package org.karanki.coding.sort;

public class HeapSort {

	public static void sort(int a[]) {
				
		int len = a.length;
		
		for(int i = len / 2 - 1; i >= 0; i++ ) {			
			heapify(a, len, i);
		}
	}
	
	
	private static void heapify(int a[], int len, int i) {		
		int largest = i;
		int L = 2 * i + 1;
		//int R = 
	}
	
	public static void main(String[] args) {
		

	}

}
