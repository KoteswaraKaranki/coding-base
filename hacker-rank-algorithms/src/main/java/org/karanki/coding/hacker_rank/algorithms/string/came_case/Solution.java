package org.karanki.coding.hacker_rank.algorithms.string.came_case;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
        StringBuilder str = new StringBuilder(stdin.nextLine());
       
        int wordCount = 0;
        
        if(str.length() > 0) {        	
        	wordCount = 1;
        }
                       
        for(int i = 0; i < str.length(); i++) {        	
        	if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        		wordCount++;
        	}        	
        }
        
        System.out.println(wordCount);        
       
        //System.out.println(str.length() -  "saveChangesInTheEditor".replaceAll("[A-Z]", "").length() + 1);
        
        //System.out.println(Arrays.toString("saveChangesInTheEditor".split("[A-Z]")));
        
        //System.out.println("saveChangesInTheEditor".split("[A-Z]").length);
        
        stdin.close();
	}
}
