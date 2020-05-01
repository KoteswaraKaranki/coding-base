package org.karanki.play.coding.prepsep2019.threads;

public class KarankiJob implements Runnable {

	@Override
	public void run() {
		notifyAll();
		job();
	}
	
	private void job() {
		String threadName = Thread.currentThread().getName();
		System.out.println(" [" + threadName + "] STARTED");
		for(int i = 0; i < 1000; i++); //kill some processing time...
		System.out.println(" [" + threadName + "] FINISHED");
	}
	
	
	public static void main(String[] args) {
		KarankiJob job = new KarankiJob();
		KarankiThreadPool pool = new KarankiThreadPool(10, job);
		job.run();
	}

}