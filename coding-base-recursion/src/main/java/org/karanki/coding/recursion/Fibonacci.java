package org.karanki.coding.recursion;

public class Fibonacci {

	public long fib(int num) {
		
		//System.out.print(" " + num);
		
		if(num <= 1) {
			return num;
		}
		
		
		
		return fib(num - 1) + fib(num -2);
	}
	
	public static void main(String[] args) {
				
		Fibonacci fib = new Fibonacci();		
		System.out.println(fib.fib(7));

	}

}
