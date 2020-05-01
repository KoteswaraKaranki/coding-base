package org.karanki.play.coding.prepsep2019.thoughtworks;

public class Session {

	private String name;
	private int duration;
	
	
	public Session(String name, int duration) {
		super();
		this.name = name;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		
		return getName() + " " + getDuration() + "min";
	}
	
}
