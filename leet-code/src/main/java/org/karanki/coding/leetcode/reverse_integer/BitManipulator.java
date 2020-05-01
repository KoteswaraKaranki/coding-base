package org.karanki.coding.leetcode.reverse_integer;

import org.junit.Test;
import static org.junit.Assert.*;

public class BitManipulator {

	
	public static boolean isKthBitSet(int number, int kthBit) {
		return (number & (1 << (kthBit-1))) > 0 ? true : false; 
	}
	
	public static int setKthBitSet(int number, int kthBit) {
		return number | (1 << (kthBit-1));
	}
	
	
	public static String toBinary(int number) {
		StringBuffer sb = new StringBuffer();
		while(number > 0) {
			sb.insert(0, (number & (1 << 0)) > 0 ? "1" : "0");
			number >>= 1;
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		
		
		/*System.out.println(BitManipulator.isKthBitSet(9, 1));
		System.out.println(BitManipulator.isKthBitSet(9, 2));
		System.out.println(BitManipulator.isKthBitSet(9, 3));
		System.out.println(BitManipulator.isKthBitSet(9, 4));
		System.out.println(BitManipulator.isKthBitSet(9, 5)); */
		
		//System.out.println(9 >> 1);
		
	}
	
	
	@Test
	public void testIsKthBitSet() {
		
		// 9 is represented as 1001
		boolean actual1 = BitManipulator.isKthBitSet(9, 1);
		boolean actual2 = BitManipulator.isKthBitSet(9, 2);
		boolean actual3 = BitManipulator.isKthBitSet(9, 3);
		boolean actual4 = BitManipulator.isKthBitSet(9, 4);
		boolean actual5 = BitManipulator.isKthBitSet(9, 5);//Remaining all bits out of 32 from 5th position have zeroes.
		
		assertEquals(true, actual1);
		assertEquals(false, actual2);
		assertEquals(false, actual3);
		assertEquals(true, actual4);
		assertEquals(false, actual5);
	}
	
	
	@Test
	public  void testToBinary() {
		
		
		String actual1 = BitManipulator.toBinary(9);
		String actual2 = BitManipulator.toBinary(4);
		String actual3 = BitManipulator.toBinary(13);
		String actual4 = BitManipulator.toBinary(14);
		String actual5 = BitManipulator.toBinary(15);
		
		assertEquals("1001", actual1);
		assertEquals("100", actual2);
		assertEquals("1101", actual3);
		assertEquals("1110", actual4);
		assertEquals("1111", actual5);
	}
	
	
	@Test
	public void testSetKthBit() {
		int actual1 = BitManipulator.setKthBitSet(9 /* 1001 */, 2); // 11
		int actual2 = BitManipulator.setKthBitSet(10 /* 1010 */, 2); // no effect
		int actual3 = BitManipulator.setKthBitSet(11 /* 1011 */, 3); //15
		int actual4 = BitManipulator.setKthBitSet(12 /* 1100 */, 2); //14
		int actual5 = BitManipulator.setKthBitSet(13 /* 1101 */, 2); // 15
		int actual6 = BitManipulator.setKthBitSet(14 /* 1110 */, 6); //46
		
		assertEquals(11, actual1);
		assertEquals(10, actual2);
		assertEquals(15, actual3);
		assertEquals(14, actual4);
		assertEquals(15, actual5);
		assertEquals(46, actual6);
	}
	
	
	
}
