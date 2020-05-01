package org.karanki.coding.threads.prac1;

import java.util.Stack;

public class MyApp implements Runnable {

	Stack<Integer> stack = new Stack<Integer>();
	
	public void run() {
		for(int c = 1; c <= 10; c++) {		
			
			System.out.println("Thread [" + Thread.currentThread() + "]");
			
			if(System.currentTimeMillis() % 2 == 0) {		
				System.out.println("IN : " + stack.push(c));				
			}else {
				if(!stack.isEmpty())
					System.out.println("OUT : " + stack.pop());
				else
					System.out.println("OUT : EMPTY");
			}			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.out.println("Thread in MAIN [" + Thread.currentThread() + "]");
		MyApp app = new MyApp();
		
		Thread thread1 = new Thread(app, "THREAD-1");		
		//thread.run();
		thread1.start();
		
				
		
		//Thread thread2 = new Thread(app, "THEAD-2");		
		//thread.run();
		//thread2.start();
		
		thread1.join();
		System.out.println("Main done");

	}

}
