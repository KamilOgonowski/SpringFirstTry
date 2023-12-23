package com.kam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kam.beans.Allegro;
import com.kam.beans.Pocztex;


public class LaunchApp {

	public static void main(String[] args) {
		
		//application context or beanfactory to activate Spring (similar as it was with hibernate)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // to activate a container -> ref variable set as a parent of class of the object
//		Allegro allegro = context.getBean(Allegro.class);  // only class name
//		Object al = context.getBean("al");  // -> approach using only reference which returns an object of Objects class
//		Allegro allegro= (Allegro) al; //or one line approach
		Allegro allegro = (Allegro) context.getBean("al");
		
		//there is also a possibility to use both - ref name and class name:
//		Allegro allegro = context.getBean("al", Allegro.class); 
		boolean status = allegro.initiateDelivery(1650);
		
		if(!status)
			System.out.println("Failed to deliver!");
		
		
	

	}

}
