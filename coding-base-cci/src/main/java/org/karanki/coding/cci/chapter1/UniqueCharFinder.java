package org.karanki.coding.cci.chapter1;

public class UniqueCharFinder {

	
	/**
	 * @param str
	 * @return
	 */
	/**
	 * @param str
	 * @return
	 */
	public boolean isUnique_BitVector(String str) {
		
		
		int checker = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			int val = str.charAt(i);
			
			if((checker & (1 << val)) > 0) {
				return false;
			}
			
			checker |= (1 << val);
			
		}
		
		return true;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		UniqueCharFinder ucf = new UniqueCharFinder();
		
		System.out.println(ucf.isUnique_BitVector("abcda"));
		
		System.out.println(1 << 33);
	}

}
