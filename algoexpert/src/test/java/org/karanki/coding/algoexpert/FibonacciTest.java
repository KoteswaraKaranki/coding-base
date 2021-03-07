package org.karanki.coding.algoexpert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.karanki.coding.algoexpert.Fibonacci;

public class FibonacciTest {


	@Test
	public void testFibByRecursion() {
		
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 
		//4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, ...
		
		assertTrue(Fibonacci.fibByRecursion(1) == 0);
		assertTrue(Fibonacci.fibByRecursion(2) == 1);
		assertTrue(Fibonacci.fibByRecursion(3) == 1);
		assertTrue(Fibonacci.fibByRecursion(4) == 2);
		assertTrue(Fibonacci.fibByRecursion(5) == 3);
		assertTrue(Fibonacci.fibByRecursion(6) == 5);
		assertTrue(Fibonacci.fibByRecursion(7) == 8);
		assertTrue(Fibonacci.fibByRecursion(8) == 13);
		assertTrue(Fibonacci.fibByRecursion(16) == 610);
		
	}
	
	
	@Test
	public void  testFibByRecursionWithMemization() {
			
		assertTrue(Fibonacci.fibByRecursionWithMemization(1, null) == 0);
		assertTrue(Fibonacci.fibByRecursionWithMemization(2, null) == 1);
		assertTrue(Fibonacci.fibByRecursionWithMemization(3, null) == 1);
		assertTrue(Fibonacci.fibByRecursionWithMemization(4, null) == 2);
		assertTrue(Fibonacci.fibByRecursionWithMemization(5, null) == 3);
		assertTrue(Fibonacci.fibByRecursionWithMemization(6, null) == 5);
		assertTrue(Fibonacci.fibByRecursionWithMemization(7, null) == 8);
		assertTrue(Fibonacci.fibByRecursionWithMemization(8, null) == 13);
		assertTrue(Fibonacci.fibByRecursionWithMemization(16, null) == 610);
		
	}
	
	
	@Test
	public void testFibByIteration() {
		assertTrue(Fibonacci.fibByIteration(1) == 0);
		assertTrue(Fibonacci.fibByIteration(2) == 1);
		assertTrue(Fibonacci.fibByIteration(3) == 1);
		assertTrue(Fibonacci.fibByIteration(4) == 2);
		assertTrue(Fibonacci.fibByIteration(5) == 3);
		assertTrue(Fibonacci.fibByIteration(6) == 5);
		assertTrue(Fibonacci.fibByIteration(7) == 8);
		assertTrue(Fibonacci.fibByIteration(8) == 13);
		assertTrue(Fibonacci.fibByIteration(16) == 610);
	}
}
