package org.karanki.coding.threads.prac2;

import java.util.Stack;

public class ThreadApp extends Thread {

	Stack stack = new Stack();
	
	@Override
	public void run() {
	
		for(int c = 1; c <= 10; c++) {			
			System.out.println("Thread [" + Thread.currentThread() + "]");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		ThreadApp app1 = new ThreadApp();		
		app1.start();
		
		
		ThreadApp app2 = new ThreadApp();		
		app2.start();
		

	}

}
