package org.karanki.play.coding.prepsep2019;

public class KnapSack {
	/**
	 * Returns the maximum value that can be put in a knapsack of capacity W 
	 * @return maximum value
	 */
	static public int knapsack(int W, int wt[], int val[]) {
		int K[][] = new int[val.length+1][W+1];
	    // Build table K[][] in bottom up manner 
		for(int i = 0; i <= val.length; i++) {
			for(int j = 0; j <= W; j++) {
				if(i == 0 || j == 0)
					K[i][j] = 0;
				else if(wt[i-1] <= j)
					K[i][j] = Math.max(val[i-1]+K[i-1][j-wt[i-1]], K[i-1][j]);
				else
					K[i][j] = K[i-1][j];
			}
		}
		return K[val.length][W];
	}
	
	public static void main(String[] args) {
		int val[] = new int[]{60, 100, 120}; 
	    int wt[] = new int[]{10, 20, 30}; 
	    int  W = 50; 
	    int n = val.length; 
	    System.out.println(knapsack(W, wt, val));
	}

}
