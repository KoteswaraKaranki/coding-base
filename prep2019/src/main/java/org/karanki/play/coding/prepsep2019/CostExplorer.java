package org.karanki.play.coding.prepsep2019;

public class CostExplorer {
	
	static public int cost(int costs[][], int source, int destination) {
		
		if(source == destination) return 0;
		if(source == destination-1) return costs[source][destination];
		
		int minCost = costs[source][destination];
		for(int currentPosition = source+1; currentPosition < destination; currentPosition++) {
			int tmp  = cost(costs, source, currentPosition) + cost(costs, currentPosition, destination);
			if(tmp < minCost) {
				minCost = tmp;
			}
		}
		return minCost;
	}
	
	public static void main(String[] args) {
		int costs[][]  = new int[][] {
			{0, 10, 75, 94},
			{-1, 0, 35, 50},
			{-1, -1, 0, 80},
			{-1, -1, -1, 0}
		};	
		System.out.println(cost(costs, 0, 3));
	}
}