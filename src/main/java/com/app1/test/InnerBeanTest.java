package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.Board;
import com.app1.beans.OnlineCourse;

public class InnerBeanTest {

	public static void main(String[] args) {

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));

		Board board = beanFactory.getBean("board", Board.class);

		System.out.println(board);

	}

}
