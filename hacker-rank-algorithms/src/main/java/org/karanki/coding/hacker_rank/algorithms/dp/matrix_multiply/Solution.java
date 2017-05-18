package org.karanki.coding.hacker_rank.algorithms.dp.matrix_multiply;

public class Solution {

	public static int[][] multiply(int a[][], int b[][]) {
		
		int result[][] = new int[a.length][b[0].length];
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < b[0].length; j++) {
				int sum = 0;
				for(int k = 0; k < a[0].length; k++) {					
					sum += a[i][k] * b[k][j];
				}				
				result[i][j] = sum;
			}
		}
		
		return result;
	}
	
	private static void print(int a[][]) {
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {				
				System.out.print(a[i][j] + "\t");				
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {


		int [][]a = { 
						{2, 3, 1},
						{2, -7, 4}					  
					};
		
		int [][]b = { 
				{3, 4, 5},
				{1, 1, 4},					  
				{2, 1, 4}
			};
		
		System.out.println("**** A ***");
		print(a);
		
		System.out.println("**** B ***");
		print(b);
		
		
		System.out.println("**** RESULT ***");
		print(multiply(a, b));
		
	}

}
