package org.karanki.play.coding.prepsep2019;

public class StringPermutation {

	public static void permutation(char[] ch, int L, int R) {
		
		if(L == R) {
			System.err.println(new String(ch));
			return;
		}
		
		for(int i = L; i <= R; i++) {
			swap(ch, L, i);
			permutation(ch, L+1, R);
			swap(ch,L, i);
		}
	}
	
	
	private static void swap(char[]  ch, int position1, int position2) {
		char temp =  ch[position1];
		ch[position1] = ch[position2];
		ch[position2] = temp;
	}
	
	public static void main(String[] args) {
		
		permutation("ABC".toCharArray(), 0, 2);
	}

}
