package com.app1.beans;

import java.util.Set;

public class Course {

	private String name;
	private Set<String> faculties;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getFaculties() {
		return faculties;
	}
	public void setFaculties(Set<String> faculties) {
		this.faculties = faculties;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", faculties=" + faculties + "]";
	}
	
	
	
}
