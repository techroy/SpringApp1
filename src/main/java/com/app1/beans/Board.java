package com.app1.beans;

public class Board {

	
	private School school;

	/*public void setSchool(School school) {
		this.school = school;
	}*/
	
	

	@Override
	public String toString() {
		return "Board [school=" + school + "]";
	}

	public Board(School school) {
		super();
		this.school = school;
	}
	
	
	
	
}
