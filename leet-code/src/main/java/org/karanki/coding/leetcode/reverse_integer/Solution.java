package org.karanki.coding.leetcode.reverse_integer;

class Solution {

	public int reverse1(int x) {

		char[] revStr = String.valueOf(x).toCharArray();
		boolean isNegativeNum = revStr[0] == '-';
		int front = isNegativeNum ? 1 : 0;
		int last = revStr.length - 1;
		char tmpChar = ' ';
		while (front < last) {
			// swap
			tmpChar = revStr[front];
			revStr[front] = revStr[last];
			revStr[last] = tmpChar;
			front++;
			last--;
		}
		try {
			return Integer.valueOf(String.valueOf(revStr));
		} catch (Exception e) {
			return 0;
		}

	}

	public int reverse(int x) {

		
		
		return 0;

	}

	public static void main(String[] args) {

		System.out.println(~2);
	}
}