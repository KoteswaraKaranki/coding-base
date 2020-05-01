package org.karanki.coding.threads.con_pro;

public class App {

	int count;
	
	int push() {
		return ++count;
	}

	int pop() {
		return --count;
	}

	public static void main(String[] args) {

		App app = new App();

		Consumer consumer = new Consumer(app);
		Producer producer = new Producer(app);

		Thread pThread = new Thread(producer);
		Thread cThread = new Thread(consumer);

		pThread.start();
		cThread.start();
	}

}

class Consumer implements Runnable {

	App app;

	Consumer(App app) {
		this.app = app;
	}

	void consume() {

		synchronized (app) {
			System.out.println("Consume " + app.pop());
			app.notifyAll();

			try {
				app.wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}

	}

	public void run() {

		for (int c = 1; c <= 10; c++) {
			consume();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		synchronized (app) {
			app.notifyAll();
		}

	}
}

class Producer implements Runnable {

	App app;

	Producer(App app) {

		this.app = app;
	}

	public void run() {

		for (int c = 1; c <= 10; c++) {

			produce();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		synchronized (app) {
			app.notifyAll();
		}
	}

	void produce() {
		synchronized (app) {
			System.out.println("Produce " + app.push());
			app.notifyAll();
			try {
				app.wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}