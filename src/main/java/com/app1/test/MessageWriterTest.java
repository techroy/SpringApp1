package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.MessageWriter;

public class MessageWriterTest {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));
		MessageWriter messageWriter = (MessageWriter)beanFactory.getBean("msgwriter");
		
		System.out.println(messageWriter.hashCode());
		
		messageWriter.writeMessage("Welcome to Spring!");
		
		
		messageWriter = (MessageWriter)beanFactory.getBean("msgwriter");
		
		System.out.println(messageWriter.hashCode());
		
	}

}
