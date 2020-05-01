package org.karanki.play.coding.prepsep2019;

public class TowerOfHanio {

	
	public static void toh(int rings, String source, String dest, String temp) {
		
		if(rings <= 0 )
			return;
		
		toh(rings-1, source, temp, dest);
		System.err.println("\nRing moved from " + source + " to " + dest);
		toh(rings-1, temp, dest, source);
		System.out.println("------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		toh(4, "PEG-1", "PEG-2", "PEG-TMP");
	}

}
