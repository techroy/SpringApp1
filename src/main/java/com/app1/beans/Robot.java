package com.app1.beans;

public class Robot {

	private String name;
	private Sensor sensor;

	public void setName(String name) {
		
		System.out.println("-------Robot setter method-----");
		this.name = name;
	}

	public Robot(Sensor sensor) {
		
		System.out.println("-------Robot constructor-----");
		this.sensor = sensor;
	}
	
	public void start(){
		
		System.out.println("name---"+name);
		System.out.println("sensor---"+sensor);
	}
	
	public void release(){
		
		System.out.println("releasing");
	}

}
