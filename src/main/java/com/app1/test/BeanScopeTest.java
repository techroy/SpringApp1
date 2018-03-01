package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.A;
import com.app1.beans.B;
import com.app1.beans.TargetByTypeBean;

public class BeanScopeTest {

	public static void main(String[] args) {

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));

		/*A a1 = beanFactory.getBean("a1", A.class);

		System.out.println(a1.hashCode());
		
		A a2 = beanFactory.getBean("a2", A.class);
		
		System.out.println(a2.hashCode());
*/
		
		
		/*B b1 = beanFactory.getBean("b1", B.class);
		
		System.out.println(b1.hashCode());
		
		B b2 = beanFactory.getBean("b1", B.class);
		
		System.out.println(b2.hashCode());*/
		
		A a1 = beanFactory.getBean("a1", A.class);
		
		System.out.println(a1.hashCode());
		
		a1.run();
		
		
		A a2 = beanFactory.getBean("a1", A.class);
		
		System.out.println(a2.hashCode());
		
		a2.run();
		
		
	}

}
