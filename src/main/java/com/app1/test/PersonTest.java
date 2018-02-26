package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.Person;

public class PersonTest {

	public static void main(String[] args) {
	
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));
		
		Person person = (Person)beanFactory.getBean("person");
		
		System.out.println(person);

	}

}
