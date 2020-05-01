package org.karanki.play.coding.prepsep2019;

public class LonestSubStringFor2EqualHalves {

	public static int get(int n[]) {
		
		int maxLen = 0;
		for(int i = 0; i < n.length; i++) {	
			for(int j = i+1; j < n.length; j += 2) {
				int len = j-i+1;
				
				if(maxLen >= len) {
					continue;
				}
				
				int lSum = 0, rSum = 0;
				for(int k = 0; k < len/2; k++) {
					lSum += n[i+k];
					rSum += n[i+k+(len/2)]; 
				}
				
				if(lSum == rSum){
					maxLen = len;
				}
			}
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
		System.out.println(get(new int[]{1,4,2,1,2,4}));
		System.out.println(get(new int[]{9,4,3,0,7,2,3}));
	}

}
