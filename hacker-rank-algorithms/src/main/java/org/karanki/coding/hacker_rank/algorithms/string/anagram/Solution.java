package org.karanki.coding.hacker_rank.algorithms.string.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		
		
		if(s1.length() != s2.length()) {			
			System.out.println("NOT ANAGRAM");
			return;
		}
		
		
		char []c1 = s1.toCharArray();
		char []c2 = s2.toCharArray();
		
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("ANAGRAM");
		}
		else {
			System.out.println("NOT ANAGRAM");
		}
		
		
		
		

	}

}
