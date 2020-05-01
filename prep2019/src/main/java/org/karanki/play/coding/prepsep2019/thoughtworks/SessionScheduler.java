package org.karanki.play.coding.prepsep2019.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class SessionScheduler implements Scheduler {

	
	@Override
	public List<List<Session>> generateSessionPermutations(List<Session>inputSessions) {

		List<List<Session>> outputSessions = new ArrayList<List<Session>>();
		
		return generateSessionPermutations(inputSessions, 0, inputSessions.size()-1, outputSessions);
	}
	
	
	private List<List<Session>> generateSessionPermutations(List<Session> inputSessions, 
			int startIndex, int endIndex, List<List<Session>> outputSessions) {

		if(startIndex == endIndex) {
			outputSessions.add(inputSessions);
		}
		
		
		for(int idx = startIndex; idx <= endIndex; idx++) {
			swap(inputSessions, startIndex, idx);
			generateSessionPermutations(inputSessions, startIndex+1, endIndex, outputSessions);
			swap(inputSessions, startIndex, idx);
		}
		
		return outputSessions;
		
	}
	
	private void swap(List<Session> inputSessions, int first, int second) {
		
		Session tmpSession = inputSessions.get(first);
		inputSessions.set(first, inputSessions.get(second));
		inputSessions.set(second, tmpSession);
		
	}
}