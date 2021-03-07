package org.karanki.coding.algoexpert;

/**
 * Find Nth number in the Fibonacci series
 * 
 * @author Koti Karanki
 *
 */

public class Fibonacci {

	public static int fibByRecursion(int n) {

		if (n == 1) {
			return 0;
		}

		else if (n == 2) {
			return 1;
		}

		else
			return fibByRecursion(n - 2) + fibByRecursion(n - 1);
	}


	public  static int fibByRecursionWithMemization(int n, int[] mem) {

		if (n <= 2) {
			return n == 1 ? 0 : 1;
		}

		else {
			
			if (mem == null || mem.length == 0) {
				mem = new int[n];
			} 
			
			if (mem[n-1] != 0)
				return mem[n-1];
			else {
				mem[n - 1] = fibByRecursionWithMemization(n - 2, mem) + fibByRecursionWithMemization(n - 1, mem);
				return mem[n - 1];
			}
		}
	}

	public static int fibByIteration(int n) {
		
		if(n <= 2) {
			return n == 1 ? 0 : 1; 
		}
		
		int iteration  = 3;
		int first = 0, second = 1;
		while(iteration <= n) {
			int tmp  = second;
			second = first + second;
			first = tmp;
			iteration++;
		}
		
		return second;
	}

}
