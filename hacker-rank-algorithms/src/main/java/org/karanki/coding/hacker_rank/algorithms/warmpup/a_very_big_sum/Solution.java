package org.karanki.coding.hacker_rank.algorithms.warmpup.a_very_big_sum;

import java.util.Scanner;

	
/**
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2016
 * 
 * @see <a href="https://www.hackerrank.com/challenges/a-very-big-sum">https://www.hackerrank.com/challenges/a-very-big-sum</a>
 *
 */
public class Solution {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long bi = 0;
        
        for(int arr_i=0; arr_i < n; arr_i++){
         
        	bi += arr[arr_i];
        }
        
        System.out.println(bi);
        
        in.close();
    }
}
