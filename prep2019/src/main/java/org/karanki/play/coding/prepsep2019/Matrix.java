package org.karanki.play.coding.prepsep2019;

public class Matrix {

	
	public static int[][] add(int MAT1[][], int MAT2[][]) {
		
		int MAT[][] = new int[MAT1.length][MAT1[0].length];
		
		for(int i = 0; i < MAT1.length; i++) {
			for(int j = 0; j < MAT1[0].length; j++) {
				MAT[i][j] = MAT1[i][j] + MAT2[i][j];
			}
		}
		
		return MAT;
	}
	
	public static int[][] rotate90(int [][]MAT) {
		
		int [][]RES = transpose(MAT);
		
		for(int ROWID = 0; ROWID < RES.length; ROWID++) {
			int start = 0, end = RES[0].length-1; 
			while(start < end) {
				RES[ROWID][start] = RES[ROWID][start] ^ RES[ROWID][end];
				RES[ROWID][end]   = RES[ROWID][start] ^ RES[ROWID][end];
				RES[ROWID][start] = RES[ROWID][start] ^ RES[ROWID][end];
				start++; end--;
			}
		}
		
		return RES;
	}
	
	public static int[][] transpose(int MAT[][]) {
		
		int RES[][] = new int[MAT.length][MAT[0].length];
		for(int i =0; i < MAT.length; i++) {
			for(int j = 0; j < MAT[0].length; j++) {
				RES[i][j] = MAT[j][i];
			}
		}
		
		return RES;
	}
	
	public static int[][] multiply(int MAT1[][], int MAT2[][]) {
		
		int MAT[][] = new int[MAT1.length][MAT2[0].length];
		
		for(int i = 0; i < MAT.length; i++) {
			for(int j = 0; j < MAT[0].length; j++) {
				MAT[i][j] = 0;
				for(int k = 0; k < MAT2.length; k++) {
					MAT[i][j] += MAT1[i][k] * MAT2[k][j];
				}
			}
		}
		return MAT;
	}
	
	public static void printSpiral(int [][]MAT) {
		int TOP = 0, BOTTOM = MAT.length-1, LEFT = 0, RIGHT = MAT[0].length-1;
		int DIRECTION = 0;
		
		while(TOP <= BOTTOM && LEFT <= RIGHT) {
			if(DIRECTION == 0) { // LEFT TO RIGHT
				for(int i = LEFT; i <= RIGHT; i++) {
					System.err.print(MAT[TOP][i] + ", ");
				}
				TOP++;
				DIRECTION = 1;
			}
			
			else if(DIRECTION == 1) { //TOP TO BOTTOM
				for(int i = TOP; i <= BOTTOM; i++) {
					System.err.print(MAT[i][RIGHT] + ", ");
				}
				RIGHT--;
				DIRECTION = 2;
			}
			else if(DIRECTION == 2) { //RIGHT TO LEFT
				for(int i = RIGHT; i >= LEFT; i--) {
					System.err.print(MAT[BOTTOM][i] + ", ");
				}
				BOTTOM--;
				DIRECTION = 3;
			}
			else if(DIRECTION == 3) {
				for(int i = BOTTOM; i <= TOP; i++) {
					System.err.print(MAT[i][LEFT] + ", ");
				}
				LEFT++;
				DIRECTION = 0;
			}
		}
	}
	
	public static void display(int MAT[][]) {
		for(int i = 0; i < MAT.length; i++) {
			for(int j = 0; j < MAT[0].length; j++) {
				System.err.print(MAT[i][j] + "\t");
			}
			System.err.println("\n");
		}
	}
	
	public static void main(String[] args) {
		

		int [][]MAT1 = new int[][] { {1,2,3},
									{4,5,6},
									{7,8,9}
								};
								
		int [][]MAT2 = new int[][] { {1,5},
									{2,3},
									{1,7}
		};
		
		int [][]MAT3 = new int[][] { {1,2,3,7},
									 {5,2,8,1}
								};
								
		
		//display(add(MAT1, MAT2));
		
		//display(multiply(MAT2, MAT3));
								
		//printSpiral(MAT1);
								
		display(rotate90(MAT1)); 
	}

}
