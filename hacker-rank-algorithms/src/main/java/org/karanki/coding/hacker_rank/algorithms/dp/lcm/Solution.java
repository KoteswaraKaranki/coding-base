package org.karanki.coding.hacker_rank.algorithms.dp.lcm;




public class Solution {

	
	static public int lcs(String s1, String s2, int M, int N) {
		
		int result = 0;
		
		if(M == 0 || N == 0) {
			result = 0;
		}						
		else if(s1.charAt(M-1) == s2.charAt(N-1)) {			
			result = 1 + lcs(s1, s2, M-1, N-1);
		}
		else {
			int tmp1 = lcs(s1, s2, M, N-1);
			int tmp2 = lcs(s1, s2, M-1, N);
			result = Math.max(tmp1, tmp2);
		}
		
		return result;		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(lcs("ABCDGH", "AEDFHR", 6, 6 ));
		System.out.println(lcs("AGGTAB", "GXTXAYB", 6, 7 ));
	}
	
}
