package org.karanki.coding.hacker_rank.algorithms.string.CeaseCipher;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		
		Scanner stdin = new Scanner(System.in);
        String str = stdin.nextLine();
        
        StringBuilder newString = new StringBuilder();
        
        int n, nn = 0;
        
        for(int i = 0; i < str.length(); i++) {   
        	        	
        	n = str.charAt(i);        	
        	nn = n;
        	
        	if((n >= 65 && n <= 90) || (n >= 97 && n <= 122)) {
        	
        		nn = n + 2;
        		
        		if(n >= 65 && n <= 90 && nn > 90) {        			        			
        			nn += 65;
        			
        			nn = (nn % 90) +  64;
        		}   
        		else if(n >= 90 && n <= 122 && nn > 122) {        			
        			nn = (nn % 122) +  96;
        		}
        		
        	}        	
        	        
        	newString.append((char)nn);        	
        }
        
        System.out.println(newString);
        
        stdin.close();
	}

}
