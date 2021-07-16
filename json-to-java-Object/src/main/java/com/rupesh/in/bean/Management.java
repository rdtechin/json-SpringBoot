package com.rupesh.in.bean;

public class Management {

	private String team;
	private String name;
	 
	
	public Management() {
		
	}
	
	 public Management(String team, String name) {
			super();
			this.team = team;
			this.name = name;
		}
	 
	 
	 public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
