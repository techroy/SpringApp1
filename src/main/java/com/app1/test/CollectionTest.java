package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.Course;
import com.app1.beans.Person;
import com.app1.beans.Student;

public class CollectionTest {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));
		
		//Student student =beanFactory.getBean("std",Student.class);
		
		//System.out.println(student);
		
		
		Course course =beanFactory.getBean("course",Course.class);
		
		System.out.println(course);


	}

}
