package com.app1.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class A implements BeanFactoryAware {

	private String beanId;

	private BeanFactory beanFactory;

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		this.beanFactory =  beanFactory;
		
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void run() {

		B b;
		// BeanFactory beanFactory = new XmlBeanFactory(new
		// ClassPathResource("com/app1/config/application-context.xml"));
		b = (B) beanFactory.getBean(beanId);
		System.out.println("--->" + b.hashCode());

	}

}
