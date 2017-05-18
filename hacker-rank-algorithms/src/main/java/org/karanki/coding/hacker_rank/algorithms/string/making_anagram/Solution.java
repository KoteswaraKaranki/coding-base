package org.karanki.coding.hacker_rank.algorithms.string.making_anagram;

public class Solution {

	public static void main(String[] args) {

		String s1 = "cde";
		String s2 = "abc";

		int cArr[] = new int[26];
		
		for (int i = 0; i < s1.length(); i++)
			cArr[s1.charAt(i) - 97]++;
		
		for (int i = 0; i < s2.length(); i++)
			cArr[s2.charAt(i) - 97]--;
		
		int count = 0;
		
		for (int i = 0; i < 26; i++)
			count += Math.abs(cArr[i]);
		
		System.out.println(count);
	}
}
