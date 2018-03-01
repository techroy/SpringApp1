package com.app1.beans;

public class TargetByTypeBean {

	private DependentBean dependentBean;
	
	private Engine engine;

	
	public TargetByTypeBean(Engine engine,DependentBean dependentBean) {
		super();
		System.out.println("2nd consructor");
		this.dependentBean = dependentBean;
		this.engine = engine;
	}
	
	
	public TargetByTypeBean(DependentBean dependentBean, Engine engine) {
		
		super();
		System.out.println("1st consructor");
		this.dependentBean = dependentBean;
		this.engine = engine;
	}



	
	public TargetByTypeBean(DependentBean dependentBean) {
		super();
		this.dependentBean = dependentBean;
		
	}



	@Override
	public String toString() {
		return "TargetByTypeBean [dependentBean=" + dependentBean + ", engine=" + engine + "]";
	}



	/*public void setDependentBean(DependentBean dependentBean) {
		this.dependentBean = dependentBean;
	}*/



	
	
	
	
}
