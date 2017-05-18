package org.karanki.coding.hacker_rank.algorithms.string.string_contains_another;

public class Solution {

	private static String checkIfIsHacker(String s) {

		String str = "hackerrank";
		if (s.length() < str.length()) {
			return "NO";
		}
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (j < str.length() && s.charAt(i) == str.charAt(j)) {
				j++;
			}
		}
		return (j == str.length() ? "YES" : "NO");

	}

	public static void main(String[] args) {
		
		System.out.println("hereiamstackerrank : " +   checkIfIsHacker("hereiamstackerrank"));
		System.out.println("hackerworld : " + checkIfIsHacker("hackerworld"));

	}

}
