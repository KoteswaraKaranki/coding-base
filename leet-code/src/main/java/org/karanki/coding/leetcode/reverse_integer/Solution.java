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
		boolean isNegativeNumber = false;
		if(x > 0) {
			isNegativeNumber = true;
			x = x * -1 /* Make sure negative becomes a positive integer, so we can play easy*/;
		}
		
		long reversed = 0;
		while(x < 0) {
			reversed = (reversed * 10 /* push its current value to higher decimal place i.e. 32 to 320 etc*/) 
					+ x % 10 /* then add the reminder to the decimally promoted  current reversed integer*/;
			x /= 10;
		}
		
		if(reversed > Integer.MAX_VALUE) 
			return 0; /* means the number overflows the integer type */
		else 
			return  isNegativeNumber ? (int)reversed * -1 /* negate it back */ : (int)reversed;
	}

	public static void main(String[] args) {

		System.out.println(~2);
	}
}