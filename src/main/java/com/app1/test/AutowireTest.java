package com.app1.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.app1.beans.TargetBean;
import com.app1.beans.TargetByTypeBean;

public class AutowireTest {

	
	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/app1/config/application-context.xml"));
		
		//TargetBean  targetBean = beanFactory.getBean("target",TargetBean.class);
		
		//System.out.println(targetBean);
		
		TargetByTypeBean  targetByTypeBean = beanFactory.getBean("targetByType",TargetByTypeBean.class);
		
		System.out.println(targetByTypeBean);
		
	}
}
