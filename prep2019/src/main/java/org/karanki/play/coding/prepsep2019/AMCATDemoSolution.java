package org.karanki.play.coding.prepsep2019;

import java.util.ArrayList;
import java.util.List;

public class AMCATDemoSolution {

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public List<Integer> cellCompete(int[] states, int days) {
		List<Integer> finalStates = new ArrayList<Integer>(states.length);

		for (int day = 1; day <= days; day++) {
			int result = 0;
			for (int cell = 0; cell < states.length; cell++) {
				if (cell == 0) {
					result = states[cell + 1] == 1 ? 1 : 0;
				} else if (cell == states.length - 1) {
					result = states[cell - 1] == 1 ? 1 : 0;
				} else {
					result = (states[cell - 1] ^ states[cell + 1]) > 0 ? 1 : 0;
				}
				if (day == 1) {
					finalStates.add(result);
				} else {
					finalStates.set(cell, result);
				}
				// System.out.println(states[cell] + " for day " + day);
			}

			// copy back to the states for every EOD
			for (int counter = 0; counter < states.length; counter++) {
				states[counter] = finalStates.get(counter);
			}
		}

		// System.out.println("Size :: " + finalStates.size());
		return finalStates;
	}
	// METHOD SIGNATURE ENDS

	public static void main(String[] args) {
	
	
	}
}
