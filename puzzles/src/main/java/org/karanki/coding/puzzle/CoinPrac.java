package org.karanki.coding.puzzle;

public class CoinPrac {

	static public int minCoins(int d[], int money) {
		
		if(money == 0) {
			return money; 
		}
		
		int R = Integer.MAX_VALUE;
		
		for(int i = 0; i < d.length; i++) {
			
			if(d[i] <= money) {				
				int SR =  minCoins(d, money - d[i]);
				if(SR + 1 < R) {					
					R = SR + 1;
				}
			}
		}
		
		return R;				
	}
	
	public static void main(String[] args) {

	    int coins[] =  {9, 6, 5, 1};       
	       int V = 25;
	       System.out.println("Minimum coins required is "+ minCoins(coins, V) );

	}

}
