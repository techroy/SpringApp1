package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.DbConfig;
import com.app1.beans.Person;

public class BeanFactoryApplicationContextTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/app1/config/application-context.xml");

		DbConfig dbConfig = (DbConfig) applicationContext.getBean("dbconfig");

		System.out.println(dbConfig);

	}

}
