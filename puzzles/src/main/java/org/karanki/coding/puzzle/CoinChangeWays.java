package org.karanki.coding.puzzle;

import java.util.HashMap;
import java.util.Map;

public class CoinChangeWays {

	public static int makeChange(int []coins, int money, int index, Map<String, Integer> memo) {
		
		if(money == 0 ) return 1;
				
		if(index >= coins.length) return 0;
		
		int amountWithCoin = 0;		
		int ways = 0;
		
		String key = money + "-" + index;
		
		if(memo.containsKey(key)) return memo.get(key);
		
		while(amountWithCoin <= money) {			
			int remainingMoney = money - amountWithCoin;			
			ways += makeChange(coins, remainingMoney, index+1, memo);
			amountWithCoin += coins[index];
		}		
		
		memo.put(key, ways);
		return ways;
	}
	
	public static void main(String[] args) {
		
		int[] coins = {1, 2, 5, 10};
		int money = 16;
		
		System.out.println(makeChange(coins, money, 0, new HashMap<String, Integer>()));
	}

}
