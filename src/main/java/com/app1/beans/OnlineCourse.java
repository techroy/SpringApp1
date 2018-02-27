package com.app1.beans;

import java.util.Properties;

public class OnlineCourse {

	
	private Properties facultyStudent;

	public OnlineCourse(Properties facultyStudent) {
		super();
		this.facultyStudent = facultyStudent;
	}

	@Override
	public String toString() {
		return "OnlineCourse [facultyStudent=" + facultyStudent + "]";
	}

		
	
}
