package org.karanki.coding.hacker_rank.algorithms.warmpup.compare_the_triplets;


import java.util.Scanner;


/**
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2016
 * 
 * @see <a href="https://www.hackerrank.com/challenges/compare-the-triplets">https://www.hackerrank.com/challenges/compare-the-triplets</a>
 *
 */
public class Solution {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        
    	int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        
        int alicePoints = 0, bobPoints = 0;
        
        if(a0 > b0 )
        {
        	alicePoints++;
        }
        else if (a0 < b0)
        {
        	bobPoints++;
        }
        	
        
        if(a1 > b1 )
        {
        	alicePoints++;
        }
        else if (a1 < b1)
        {
        	bobPoints++;
        }
        
        if(a2 > b2 )
        {
        	alicePoints++;
        }
        else if (a2 < b2)
        {
        	bobPoints++;
        }
        
        System.out.println(alicePoints + " " + bobPoints);
        
        in.close();
    }
}