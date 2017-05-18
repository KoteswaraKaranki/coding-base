package org.karanki.coding.string;

public class PermutationPrac {

	static public void permute(String str, int S, int E) {
		
		if(S == E)  System.out.println(str);
		
		else {
			
			
			for(int i = S; i <= E; i++) {				
				str = swap(str, S, i);
				permute(str, S+1, E);
				str = swap(str, S, i);
			}
			
		}
	}
	
	static private String swap(String str, int sIdx, int dIdx) {
		
		char c[] = str.toCharArray();
		char tmp = c[sIdx];
		c[sIdx] = c[dIdx];
		c[dIdx] = tmp;
		
		return new String(c);
	}
	
	public static void main(String[] args) {

		String str = "abcd";
		permute(str, 0, str.length() - 1);		

	}

}
