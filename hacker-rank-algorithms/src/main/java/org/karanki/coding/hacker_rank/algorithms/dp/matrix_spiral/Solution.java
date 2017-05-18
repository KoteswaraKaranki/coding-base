package org.karanki.coding.hacker_rank.algorithms.dp.matrix_spiral;

public class Solution {

	
	static public void spiral(int a[][], int M, int N) {
		
		int T = 0, B = M -1, L = 0, R = N -1;
		int DIR = 0;
		int i;
		
		while(T <= B && L <= R) {
		
			if(DIR == 0) {
				for(i = L; i <= R; i++) {
					System.out.print(a[T][i] + ", ");
				}				
				T++;							
			}
			
			else if (DIR == 1) {
				for(i = T; i <= B; i++) {
					System.out.print(a[i][R] + ", ");
				}
				R--;								
			}
			
			else if(DIR == 2) {
				for(i = R;  i >= L; i--) {				
					System.out.print(a[B][i] + ", ");
				}
				B--;				
			}
			else if(DIR == 3) {
			
				for(i = B; i >= T; i--) {
					System.out.print(a[i][L] + ", ");
				}
				L++;			
			}			
			DIR = (DIR + 1) % 4;													
		}
		 
	}
		
	private static void print(int a[][]) {
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[0].length; j++) {				
				System.out.print(a[i][j] + ", ");				
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		int [][]a = { 
				{3, 4, 5, 7},
				{1, 1, 3, 8},					  
				{2, 1, 4, 9}
			};
		
		System.out.println("**** ARRAY ***");
		print(a);
		
		System.out.println("**** SPIRAL ARRAY ***");
		spiral(a, a.length, a[0].length);
		
	}

}
 