package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.Car;

public class IdRefTest {

	public static void main(String[] args) {

		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));
		
		Car car = beanFactory.getBean(Car.class);
		
		car.run();
	}

}
