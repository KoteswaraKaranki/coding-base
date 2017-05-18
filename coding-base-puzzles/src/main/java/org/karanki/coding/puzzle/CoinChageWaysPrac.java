package org.karanki.coding.puzzle;

public class CoinChageWaysPrac {

	static public int makeChange(int []d, int money, int index) {
		
		if(money == 0) return 1;
		
		if(index >= d.length) return 0;
		
		int tempAmount = 0;		
		int ways = 0;
		
		while(tempAmount <= money) {		
			int bal = money  - tempAmount;
			ways += makeChange(d, bal,index+1);
			tempAmount += d[index];
		}
				
		return ways;
	}
	
	public static void main(String[] args) {
		
		
		int[] coins = {1, 2, 5, 10};
		int money = 16;
		
		System.out.println(makeChange(coins, money, 0));

	}

}
