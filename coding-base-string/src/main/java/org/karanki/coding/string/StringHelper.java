package org.karanki.coding.string;

public class StringHelper {

	/**
	 * Accepts & Considers only small case alphabets.
	 * @param str to be searched through
	 * @return index of the first non-duplicated character
	 */
	
	public int indexOfNonDuplicateChar(String str) {
								
		byte[] asciiTable = new byte[26];
		
		for(int i = 0; i < str.length(); i++) {			
			asciiTable[str.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < asciiTable.length; i++) {		
			if(asciiTable[i] == 1) return i;
		}

		return -1;
	}
	
}
