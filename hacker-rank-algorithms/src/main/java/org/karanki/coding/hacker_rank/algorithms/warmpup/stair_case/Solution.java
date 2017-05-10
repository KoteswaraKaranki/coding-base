package org.karanki.coding.hacker_rank.algorithms.warmpup.stair_case;

import java.util.Scanner;


/**
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2016
 * 
 * @see <a href="https://www.hackerrank.com/challenges/staircase">https://www.hackerrank.com/challenges/staircase</a>
 *
 */
public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int c = n-1; c >= 0; c--) {
			for (int cc = 0; cc < n; cc++) {
				if (cc >= c) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		in.close();
	}
}
