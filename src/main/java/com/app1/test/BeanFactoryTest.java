package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.DbConfig;
import com.app1.beans.Person;

public class BeanFactoryTest {

	public static void main(String[] args) {
	
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));
		
		BeanFactoryPostProcessor beanFactoryPostProcessor= (PropertyPlaceholderConfigurer)beanFactory.getBean("ppc");
		
		beanFactoryPostProcessor.postProcessBeanFactory((ConfigurableListableBeanFactory)beanFactory);
		
		DbConfig dbConfig = (DbConfig)beanFactory.getBean("dbconfig");
		
		System.out.println(dbConfig);

	}

}
