package org.karanki.coding.puzzle;

public class EggProblem {

	/*
	 * Function to get minimum number of trials needed in worst case with n eggs
	 * and k floors
	 */
	public static int eggDrop(int eggs, int floors) {
		// If there are no floors, then no trials needed. OR if there is
		// one floor, one trial needed.
		if (floors == 1 || floors == 0)
			return floors;

		// We need k trials for one egg and k floors
		if (eggs == 1)
			return floors;

		int min = Integer.MAX_VALUE, res;

		// Consider all droppings from 1st floor to kth floor and
		// return the minimum of these values plus 1.
		for (int cnt = 1; cnt <= floors; cnt++) {
			res = Math.max(eggDrop(eggs - 1, cnt - 1), eggDrop(eggs, floors - cnt));
			if (res < min)
				min = res;
		}

		return min + 1;
	}


	public static void main(String[] args) {

		int eggs = 2, floors = 20;
		
		System.out.println("Nof of trails in worst case for with " +  eggs + ", and floors " + floors + " are : " + 		
				eggDrop(eggs, floors));
		
	}

}
