package com.app1.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car {

	private String engineId;
	
	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}

	private Engine engine;

	public void run() {

		System.out.println("Running");
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));
		Engine engine = beanFactory.getBean(engineId, Engine.class);

		engine.start();

	}

}
