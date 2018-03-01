package com.app1.beans;

public class TargetBean {

	
	private DependentBean dependentBean;
	
	private Engine engine1;

	public void setDependentBean(DependentBean dependentBean) {
		this.dependentBean = dependentBean;
	}

	@Override
	public String toString() {
		return "TargetBean [dependentBean=" + dependentBean + ", engine=" + engine1 + "]";
	}

	
	
	
	
	
}
