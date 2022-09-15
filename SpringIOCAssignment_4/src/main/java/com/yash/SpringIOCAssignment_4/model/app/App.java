package com.yash.SpringIOCAssignment_4.model.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.SpringIOCAssignment_4.model.ConstructorMessage;

public class App {
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Spring IOC 4th Assignment");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		ConstructorMessage cm=(ConstructorMessage) context.getBean("cm");
		System.out.println(cm);
		
	}

}
