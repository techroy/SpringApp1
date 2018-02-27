package com.app1.beans;

import java.util.Map;

public class College {

	
	private Map<String, Course> studentCourseMap;

	public void setStudentCourseMap(Map<String, Course> studentCourseMap) {
		this.studentCourseMap = studentCourseMap;
	}

	@Override
	public String toString() {
		return "College [studentCourseMap=" + studentCourseMap + "]";
	}
	
	
	
	
}
