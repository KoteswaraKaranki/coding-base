package org.karanki.play.coding.prepsep2019;

public class FizzBuzz {

	static public void fb(int n) {
		
		for(int idx = 1; idx <= n; idx++) {
			
			if(idx >= 3 && idx >= 5 && (idx % 3 == 0) && idx%5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(idx >= 3 && idx % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(idx >= 5 && idx % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(idx);
			}
		}
		
	}
	
	public static void main(String[] args) {
		fb(15);
	}

}
