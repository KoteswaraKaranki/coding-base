package org.karanki.coding.leetcode.longest_substring;

import java.util.Arrays;

class Solution {

	public int lengthOfLongestSubstring(String s) {

		boolean charFilledArray[] = new boolean[127];
		int uniqueLength = 0;
		int maxLength = 0;

		for (int idx = 0; idx < s.length(); idx++) {
			char ch = s.charAt(idx);
			if (charFilledArray[ch]) {
				//uniqueLength--;
				//Arrays.fill(charFilledArray, false);
				//charFilledArray[ch] = false;
				if (uniqueLength > maxLength) {
					maxLength = uniqueLength;
				}
			} else {
				charFilledArray[ch] = true;
				uniqueLength++;
			}
		}
		
		if (uniqueLength > maxLength) {
			maxLength = uniqueLength;
		}

		return maxLength;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));
		System.out.println(new Solution().lengthOfLongestSubstring("bbbbb"));
		System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
		System.out.println(new Solution().lengthOfLongestSubstring("abcdefghcabcdefghijkllabc"));
		System.out.println(new Solution().lengthOfLongestSubstring("aab"));
		System.out.println(new Solution().lengthOfLongestSubstring("dvdf"));
	}
}