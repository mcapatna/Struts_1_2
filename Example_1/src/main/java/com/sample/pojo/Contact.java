package com.sample.pojo;

public class Contact {
	private String Name;
	private int runs;
	private String ground;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Contact(String name, int runs, String ground) {
		super();
		Name = name;
		this.runs = runs;
		this.ground = ground;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public String getGround() {
		return ground;
	}

	public void setGround(String ground) {
		this.ground = ground;
	}

}
