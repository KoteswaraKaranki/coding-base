package org.karanki.coding.leetcode.add_two_numbers;

/**
 * <pre>
 * https://leetcode.com/problems/add-two-numbers/
 * 
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list. 
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Example: 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 
 * Output: 7 -> 0 -> 8 
 * Explanation: 342 + 465 = 807.
 * 
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 
 * </pre>
 * 
 * @author Koti Karanki
 * @since Oct 2019
 *
 */

public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode HEAD = null, PREV = null, TEMP = null;
		int cf = 0;
		int l1Value = 0, l2Value = 0;
		int total = 0;
		int curNodeVal = 0;
		
		while (l1 != null || l2 != null) {
			
			l1Value = l2Value = 0;
			
			if (l1 != null) {
			   l1Value = l1.val;	
			   l1 = l1.next;
			}
			
			if (l2 != null) {
				l2Value = l2.val;
				l2 = l2.next;
			}
			
			total = cf + l1Value + l2Value;
			cf = total / 10;
			curNodeVal = total % 10; 
			
			TEMP = new ListNode(curNodeVal);
			
			if(HEAD == null) {
				HEAD = PREV = TEMP;
			}
			else
			{
				PREV.next = TEMP;
				PREV = TEMP;
			}	
		}
		
		if(cf > 0) {
			TEMP = new ListNode(cf);
			PREV.next = TEMP;
		}
		
		return HEAD;
	}

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		ListNode l1_1 = new ListNode(9);
		ListNode l1_2 = new ListNode(9);
		l1_1.next = l1_2;
		ListNode l1_3 = new ListNode(8);
		l1_2.next = l1_3;

		ListNode l2_1 = new ListNode(6);
		ListNode l2_2 = new ListNode(2);
		l2_1.next = l2_2;

		ListNode l2_3 = new ListNode(9);
		l2_2.next = l2_3;
		
	
		/*
		ListNode l1_1 = new ListNode(9);
		
		ListNode l2_1 = new ListNode(1);
		ListNode l2_2 = new ListNode(9); l2_1.next = l2_2;
		ListNode l2_3 = new ListNode(9); l2_2.next = l2_3;
		ListNode l2_4 = new ListNode(9); l2_3.next = l2_4;
		ListNode l2_5 = new ListNode(9); l2_4.next = l2_5;
		
		ListNode l2_6 = new ListNode(9); l2_5.next = l2_6;
		ListNode l2_7 = new ListNode(9); l2_6.next = l2_7;
		ListNode l2_8 = new ListNode(9); l2_7.next = l2_8;
		ListNode l2_9 = new ListNode(9); l2_8.next = l2_9;
		ListNode l2_10 = new ListNode(9); l2_9.next = l2_10;
		
		*/
		

		ListNode newNode = sol.addTwoNumbers(l1_1, l2_1);

		while (newNode != null) {

			System.out.println(newNode.val);
			newNode = newNode.next;
		}
		


	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
