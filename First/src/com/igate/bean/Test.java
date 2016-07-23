package com.igate.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory bn = new XmlBeanFactory(res);
		Bean b = (Bean) bn.getBean("ans2");
		b.dispAll();

	}

}
