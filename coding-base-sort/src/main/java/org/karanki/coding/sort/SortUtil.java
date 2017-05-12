package org.karanki.coding.sort;

public class SortUtil {

	
	public static void swap(int []a, int sIdx, int dIdx) {		
		int temp = a[sIdx];
		a[sIdx] = a[dIdx];
		a[dIdx] = temp;		
	}
}
