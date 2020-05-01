package org.karanki.play.coding.prepsep2019;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.LinkedList;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{        
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int numberAmazonGoStores(int rows, int column, List<List<Integer> > grid)
    {
        int grids[][] = new int[rows][column];
        
        int rowIdx = 0;  int colIdx = 0; 
        
        for(List<Integer> record : grid) {
            colIdx = 0;
            for(int val : record) {
                grids[rowIdx][colIdx++] = val;
            }
            rowIdx++;
        }
        
        //visited information (true/false) fo the grid is stored 
        //default value being false for primitives
        boolean visited[][] = new boolean[rows][column];
        
        //Queue which can flow through for all connected grids &
        //fills-in the visited grid
        //LL is of type Queue in Java
        LinkedList<Data> queue = new LinkedList();
        Data current = null;
        int gridCount = 0;
        
        int currentRowIdx, currentColIdx = 0;
        
        for(rowIdx = 0; rowIdx < rows; rowIdx++) {
            for(colIdx = 0; colIdx < column; colIdx++) {
                queue.clear();
                if(!visited[rowIdx][colIdx] && grids[rowIdx][colIdx] == 1) {
                    queue.add(new Data(rowIdx, colIdx));
                    while(!queue.isEmpty()){
                        current = queue.pop();
                        currentRowIdx = current.x;
                        currentColIdx = current.y;
                        
                        if(grids[currentRowIdx][currentColIdx] == 1) {
                            if(!visited[currentRowIdx-1][currentColIdx] 
                               && grids[currentRowIdx-1][currentColIdx] == 1 && currentRowIdx != 0) {
                              queue.add(new Data(currentRowIdx-1, currentColIdx));
                              visited[currentRowIdx-1][currentColIdx] = true;
                            }
                            
                            
                            
                            if(!visited[currentRowIdx+1][currentColIdx] 
                                && grids[currentRowIdx+1][currentColIdx] == 1 && currentRowIdx != rows ) {
                              queue.add(new Data(currentRowIdx+1, currentColIdx));
                              visited[currentRowIdx+1][currentColIdx] = true;
                            }
                            if(!visited[currentRowIdx][currentColIdx-1] 
                                && grids[currentRowIdx][currentColIdx-1] == 1 && currentColIdx != 0) {
                              queue.add(new Data(currentRowIdx, currentColIdx-1));
                              visited[currentRowIdx][currentColIdx-1] = true;
                            }
                            if(!visited[currentRowIdx][currentColIdx+1] 
                                && grids[currentRowIdx][currentColIdx+1] == 1 && currentColIdx != column) {
                              queue.add(new Data(currentRowIdx, currentColIdx+1));
                              visited[currentRowIdx][currentColIdx+1] = true;
                            }
                        }
                    }
                    gridCount++;
                }

            }
            
            
        }
        return gridCount;
        
    }
    // METHOD SIGNATURE ENDS
    
    class Data  {
    //in ream time, we should perhaps use getters and setters
    private int x;
    private int y;
    
    Data(int x, int y) {
        this.x = x;
        this.y = y;
    }
    }
}