
package org.karanki.coding.hacker_rank.algorithms.warmpup.simple_array_sum;

import java.util.Scanner;

/**
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2016
 * 
 * @see <a href="https://www.hackerrank.com/challenges/simple-array-sum">https://www.hackerrank.com/challenges/simple-array-sum</a>
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
        
        
        int sum = 0;
        
        for(int c = 0; c < n; c++)
        {
        	sum += arr[c];
        }
        
        System.out.println(sum);
        
        in.close();
    }
}
