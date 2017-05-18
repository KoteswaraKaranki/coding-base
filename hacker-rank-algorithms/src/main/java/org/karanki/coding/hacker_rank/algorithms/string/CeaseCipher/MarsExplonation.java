package org.karanki.coding.hacker_rank.algorithms.string.CeaseCipher;

public class MarsExplonation {

	public static int countChanges(String message) {
		String sos = "SOS";
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) != sos.charAt(i % 3)) 
			{
				count++;
			}
				
		}
		return count;
	}

	public static void main(String[] args) {

		//Scanner in = new Scanner(System.in);
		//String S = in.next();

		System.out.println(countChanges("SOSSPSSQSSOR"));

	}

}
