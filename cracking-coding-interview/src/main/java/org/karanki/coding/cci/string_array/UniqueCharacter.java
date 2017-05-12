package org.karanki.coding.cci.string_array;

public class UniqueCharacter {

	public boolean  isUniqueCharSet(String str) {
				
		if(str.length() > 128) return false;
		
		boolean [] asciiTable = new boolean[128];
		
		char []chars = str.toCharArray();
		
		for(char ch : chars) {
			
			if(asciiTable[ch]) {
				return false;
			}			
			asciiTable[ch] = true;
		}		
		
		return true;
	}	
	
	public boolean isUniqueCharSetByBitVector(String str) {
		
		int checker = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int val =  str.charAt(i ) - 'a';
			if((checker & (1 << val)) > 0) {				
				return false;
			}			
			checker = checker | 1 << val;
		}
		return true;		
	}

}
