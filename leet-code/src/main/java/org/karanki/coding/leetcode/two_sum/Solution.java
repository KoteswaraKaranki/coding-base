package org.karanki.coding.leetcode.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * https://leetcode.com/problems/two-sum/
 * 
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target. 
 * You may assume that each input would have exactly one solution, and you may not use the same element 
 * twice. 
 * 
 * 
 * Example: 
 * 
 * Given nums = [2, 7, 11, 15], target = 9, 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * </pre>
 * 
 * @author Koti Karanki
 *
 */
public class Solution {

	
	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> numberSet = new HashMap();	
		
		for(int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
			Integer prevIndex = numberSet.get(target - nums[currentIndex]);
			if(prevIndex != null) {
				return new int[] {prevIndex, currentIndex };
			}
			else {
				numberSet.put(nums[currentIndex], currentIndex);
			}
		}
		return new int[]{};
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
	}
}
