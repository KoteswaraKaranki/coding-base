package org.karanki.coding.sort;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		
		go();

	}
	
	
	private static void go()
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int []A = new int[n];

		
		for(int c = 0; c < n; c++)
		{
			 A[c] =  scan.nextInt();
		}
			
		
		System.out.println(ascSort(A, A.length));
		
		scan.close();
		
	}


	private static boolean ascSort(int[] A, int n) {
		
		if(n == 1)
			return true;
		
		return A[n - 1] < A[n - 2] ? false : ascSort(A, n - 1);
	}

}
