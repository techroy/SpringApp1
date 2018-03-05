package com.app1.beans;

public class EmiCalculator {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public int claculate(int principal, int rate, int time) {

		System.out.println("name of Emi Calculator--" + name);
		return (principal * rate * time) / 100;
	}

}
