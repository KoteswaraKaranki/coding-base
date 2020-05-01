package org.karanki.coding.threads;

public class DeadLockProducer {

	public static void main(String[] args) {

		System.out.println(Double.MIN_VALUE + ", " + Double.MAX_VALUE);
		
		String s1 = new String("String-1");
		String s2 = new String("String-2");

		Thread t1 = new Thread() {
			@Override
			public void run() {

				while (true) {
					synchronized (s1) {
						System.out.println("THREAD-1 :: Acquired s1 lock, waiting for s2 lock");
						/*try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}*/
						synchronized (s2) {
							System.out.println("THREAD-1 :: Acquired s1 lock &&  Acquired s2 lock");
						}
					}

				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {

				while (true) {
					synchronized (s2) {
						System.out.println("THREAD-2 :: Acquired s2 lock, waiting for s1 lock");
						/*try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}*/
						synchronized (s1) {
							System.out.println("THREAD-2 :: Acquired s2 lock &&  Acquired s1 lock");
						}
					}

				}
			}
		};
		
		t1.start();
		t2.start();
		
		Runnable thread = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		
		
		
		
		

	}

}
