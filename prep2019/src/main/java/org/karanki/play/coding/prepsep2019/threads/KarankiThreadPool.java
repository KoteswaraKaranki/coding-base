package org.karanki.play.coding.prepsep2019.threads;

public class KarankiThreadPool {

	private Thread pool[];
	private int poolSize;
	private Runnable OBJECT;

	private PoolManager pm = new PoolManager();

	public KarankiThreadPool(int poolSize, Runnable object) {
		this.poolSize = poolSize;
		this.OBJECT = object;
		pool = new Thread[poolSize];
		for (int i = 0; i < poolSize; i++) {
			pool[i] = new Thread(pm, "T" + (i + 1));
			pool[i].start();
		}
	}

	private class PoolManager implements Runnable {
		public void run() {
			synchronized (OBJECT) {
				while (true) {
					OBJECT.run();
					try {
						OBJECT.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
