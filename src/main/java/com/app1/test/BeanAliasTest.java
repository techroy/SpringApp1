package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.Vehicle;

public class BeanAliasTest {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));

		
		Vehicle vehicle = (Vehicle)beanFactory.getBean("bike");
		
		System.out.println(vehicle);
	}

}
