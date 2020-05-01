package org.karanki.play.coding.prepsep2019.thoughtworks;

public class SchedulerFactory {

	private final static Scheduler scheduler = new SessionScheduler();
	
	static public  Scheduler getInstance() {
		return scheduler;
	}
	
}
