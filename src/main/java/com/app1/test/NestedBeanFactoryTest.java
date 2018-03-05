package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.LoanApprover;

public class NestedBeanFactoryTest {

	public static void main(String[] args) {
		
	
		BeanFactory parentBeanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/parent-application-context.xml"));
		
		
		BeanFactory childBeanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/child-application-context.xml"),parentBeanFactory);
		
		LoanApprover loanApprover = childBeanFactory.getBean("loan",LoanApprover.class);
		
		loanApprover.verify(100,3, 3);

	}

}
