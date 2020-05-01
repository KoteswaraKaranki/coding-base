package org.karanki.play.coding.prepsep2019;

public class CoinChange {

	public static int coinChangeWaysONeilCode(int coins[], int amount) {
		int comb[] = new int[amount + 1];
		comb[0] = 1;
		for (int coin : coins) {
			for (int i = 1; i < comb.length; i++) {
				if (i >= coin) {
					comb[i] += comb[i - coin];
					// print(comb);
				}
			}
			// System.out.println();
		}
		return comb[amount];
	}

	public static int coinChangeWaysAlgoExpert(int denoms[], int n) {

		int ways[] = new int[n + 1];
		ways[0] = 1;

		for (int i = 0; i < denoms.length; i++) {
			for (int j = 1; j < ways.length; j++) {
				if (denoms[i] <= j) {
					ways[j] += ways[j - denoms[i]];
				}
			}
		}
		return ways[ways.length - 1];
	}

	public static int coinChangeWaysRec(int[] denoms, int amount, int index) {
		if (amount == 0)
			return 1;
		if (index >= denoms.length)
			return 0;
		int tmpAmount = 0;
		int ways = 0;

		while (tmpAmount <= amount) {
			ways += coinChangeWaysRec(denoms, amount - tmpAmount, index + 1);
			tmpAmount += denoms[index];
		}
		return ways;
	}

	static public int minCoinChangeAlgoExpert(int denoms[], int amount) {
		int minCoins[] = new int[denoms.length + 1];
		for (int i = 0; i < minCoins.length; i++)
			minCoins[i] = Integer.MAX_VALUE;
		minCoins[0] = 0; // base case
		int result = 0;
		for (int denom : denoms) {
			for (int curTotal = 0; curTotal < denoms.length; curTotal++) {
				if (denom <= curTotal) {
					if (minCoins[curTotal - denom] == Integer.MAX_VALUE) {
						result = minCoins[curTotal-denom];
					} else {
						result = 1 + minCoins[curTotal-denom];
					}
					minCoins[curTotal] = Math.min(minCoins[curTotal], result);
				}
			}
		}
		return minCoins[denoms.length-1]==Integer.MAX_VALUE /* MAX in case of no coin match */
						? -1 : minCoins[denoms.length-1];
	}

	static public int minCoinChangeRec(int[] denoms, int amount, int index) {
		return -1;
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(coinChangeWaysONeilCode(new int[] { 1, 2, 3 }, 5));
		System.out.println(coinChangeWaysAlgoExpert(new int[] { 1, 2, 3 }, 5));
		System.out.println(coinChangeWaysRec(new int[] { 1, 2, 3 }, 5, 0));
		System.out.println(minCoinChangeAlgoExpert(new int[] { 1, 2, 4 }, 6));
	}

}
