package org.karanki.coding.hacker_rank.algorithms.string.super_reduced_string;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
        StringBuilder str = new StringBuilder(stdin.nextLine());
        
        
        for(int i = 0; i < str.length(); i++) {        	
        	if((i < (str.length() -1)) && (str.charAt(i) == str.charAt(i + 1))) {
        		//str.deleteCharAt(i);
        		//str.deleteCharAt(i);        		
        		str.delete(i, i + 2);        		
        		i = -1;
        	}        	
        }
                
        if(str.length() == 0) {
        	System.out.println("Empty String");
        }
        else {
        	System.out.println(str);
        }
        
       
        stdin.close();
		
		//System.out.println(new StringBuilder("baab").delete(1, 3));
		
	}

}
