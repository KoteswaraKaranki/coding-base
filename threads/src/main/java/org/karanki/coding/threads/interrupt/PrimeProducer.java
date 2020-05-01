package org.karanki.coding.threads.interrupt;

import java.math.BigInteger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class PrimeProducer extends Thread {

	private final BlockingQueue<BigInteger> queue;

	PrimeProducer(BlockingQueue<BigInteger> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			BigInteger p = BigInteger.ONE;
			while (!Thread.currentThread().isInterrupted()) {
				queue.put(p = p.nextProbablePrime());
				System.out.println("Value " + p.intValue() + " put into Q");
			}
		} catch (InterruptedException consumed) {
			/* Allow thread to exit */
		}

		System.out.println("Producer existing...");
	}

	public void cancel() {
		interrupt();
	}

	public static void main(String[] args) {

		PrimeProducer producer = new PrimeProducer(new LinkedBlockingQueue<>(1000));
		producer.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Cancel being requsted");
		producer.cancel();

	}
}