package com.kam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LaunchApp {

	public static void main(String[] args) {
		
		//application context or beanfactory to activate Spring (similar as it was with hibernate)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // to activate a container -> ref variable set as a parent of class of the object
		
	

	}

}
