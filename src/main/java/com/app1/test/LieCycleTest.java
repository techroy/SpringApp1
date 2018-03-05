package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.Robot;

public class LieCycleTest {

	public static void main(String[] args) {

		final BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));

		Robot robot = beanFactory.getBean(Robot.class);

		// ((ConfigurableListableBeanFactory)beanFactory).destroySingletons();

		Runtime.getRuntime().addShutdownHook(new Thread() {

			@Override
			public void run() {

				((ConfigurableListableBeanFactory)beanFactory).destroySingletons();
				
			}

		});

	}
}
