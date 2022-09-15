package com.yash.SpringIOCAssignment_5.model.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.SpringIOCAssignment_5.model.SetterMessage;

public class App {
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Spring IOC 5th Assignment");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		SetterMessage sm=(SetterMessage) context.getBean("sm");
		System.out.println(sm);
		
	}

}
