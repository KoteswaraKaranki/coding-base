package org.karanki.play.coding.prepsep2019;

import java.util.Map;
import java.util.TreeMap;

public class HRNextPalindrome {


    // Complete the NextSmallestPalindrome function below.
    static int[] NextSmallestPalindrome(int[] arr) {
    	
    	if(arr.length == 0 || arr.length % 2 == 0) {
    		return new int[]{-1};	
    	}
    	
    	int result[] = new int[10];
    	
    	for(int i = 0; i < arr.length; i++) {
    		result[arr[i]] += 1;
    	}
    	
    	boolean isOddFound = false;
    	boolean isPalindrome = true;
    	int palinIdx = -1;
    	for(int i = 0; i < result.length; i++) {
    		if(result[i] != 0) {
    			if( result[i] == 0 || result[i] % 2 == 1) {
    				if(isOddFound) {
    				  isPalindrome = false;
    				  break;
    				}
    				else {
    					isOddFound = true;
      				  palinIdx = i;
    				}
    			}
    		}
    	}
    	
    	int f[] = new int[arr.length];

    	if(!isPalindrome) {
    		return new int[]{-1};	
    	}
    	
    	else
    	{
    		f[(arr.length/2)+1] = arr[palinIdx];
    		int start = 0, end = arr.length - 1;
    		for(int i = 0; i < (arr.length/2); i++) {
    			f[start++]= arr[i];
    			f[end--] = arr[i];
    		}
    	}
    	
    	return f;
    }
    

	
	public static void main(String[] args) {
		System.out.println(NextSmallestPalindrome(new int[]{1,2,3, 1, 2}));

	}

}
