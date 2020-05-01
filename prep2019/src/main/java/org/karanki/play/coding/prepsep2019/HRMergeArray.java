package org.karanki.play.coding.prepsep2019;

import java.util.ArrayList;
import java.util.List;

public class HRMergeArray {

	static public List<Integer> merge(List<Integer> firstArray, List<Integer> secondArray) {
		
		//loop through from the begening
		int firstArrayCounter = 0;
		//lopp through from the end
		int secondArrayCounter = secondArray.size()-1;
		
		List<Integer> resultList = new ArrayList<Integer>(firstArray.size() + secondArray.size());
		
		//either 
		while(firstArrayCounter < firstArray.size() && secondArrayCounter >= 0 ) {
			if( firstArray.get(firstArrayCounter).compareTo
					(secondArray.get(secondArrayCounter)) <= 0) {
				resultList.add(firstArray.get(firstArrayCounter++));
			}
			else  {
				if(secondArrayCounter >= 0) {
					resultList.add(secondArray.get(secondArrayCounter--));
				}
			}
		}
		
		while(firstArrayCounter < firstArray.size() ) {
			resultList.add(firstArray.get(firstArrayCounter++));
		}
		
		while(secondArrayCounter >= 0) {
			resultList.add(secondArray.get(secondArrayCounter--));
		}
		
		return resultList;
	}
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(2);
		l1.add(5);
		l1.add(9);
		l1.add(23);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(25);
		l2.add(24);
		l2.add(10);
		l2.add(3);
		l2.add(1);

		
		System.out.println(merge(l1, l2));
		
		
	}

}
