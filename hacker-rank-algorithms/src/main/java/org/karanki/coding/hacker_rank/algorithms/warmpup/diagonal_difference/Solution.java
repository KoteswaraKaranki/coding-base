package org.karanki.coding.hacker_rank.algorithms.warmpup.diagonal_difference;


import java.util.Scanner;


/**
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2016
 * 
 * @see <a href="https://www.hackerrank.com/challenges/diagonal-difference">https://www.hackerrank.com/challenges/diagonal-difference</a>
 *
 */
public class Solution {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        
        int coOrd = 0,  d2YCord = n-1, d1Sum = 0, d2Sum = 0;
        
        //D1 = {0, 0} + {1, 1} + {2, 2} 
        //D2 = {0, 2} + {1, 1} + {2, 0}
        
        
        for(; coOrd < n; coOrd++)
        {        	
        	d1Sum += a[coOrd][coOrd];
        	d2Sum += a[coOrd][d2YCord--];
        	        	
        }
        
        System.out.println(Math.abs(d1Sum - d2Sum));
          
        in.close();
    }
}
