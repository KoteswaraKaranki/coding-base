package org.karanki.coding.hacker_rank.algorithms.warmpup.plus_minus;

import java.util.Scanner;

/**
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2016
 * 
 * @see <a href=
 *      "https://www.hackerrank.com/challenges/circular-array-rotation">https://www.hackerrank.com/challenges/circular-array-rotation</a>
 *
 */
public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int arr[] = new int[n];

		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		float posCount = 0, negCount = 0, zeroCount = 0;

		for (int c = 0; c < n; c++) {
			if (arr[c] > 0) {
				posCount++;
			} else if (arr[c] < 0) {
				negCount++;
			} else {
				zeroCount++;
			}

		}

		float result = 0;

		result = (posCount / n);
		System.out.println(String.format("%." + n + "f", result));

		result = negCount / n;
		System.out.println(String.format("%." + n + "f", result));
		
		result = zeroCount / n;
		System.out.println(String.format("%." + n + "f", result));

		in.close();
	}
}
