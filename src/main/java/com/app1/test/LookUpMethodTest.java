package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.HomeLoan;

public class LookUpMethodTest {

	public static void main(String[] args) {

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));
		
		HomeLoan homeLoan = beanFactory.getBean("homeloan",HomeLoan.class);
		
		System.out.println("Home loan hash code-->"+homeLoan.hashCode());
		
		System.out.println(homeLoan.getClass().getName());
		homeLoan.calculateLoan();
		
		homeLoan = beanFactory.getBean("homeloan",HomeLoan.class);
		
		
		System.out.println("Home loan hash code-->"+homeLoan.hashCode());
		homeLoan.calculateLoan();

	}

}
