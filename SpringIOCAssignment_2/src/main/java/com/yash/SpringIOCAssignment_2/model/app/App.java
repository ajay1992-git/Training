package com.yash.SpringIOCAssignment_2.model.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.SpringIOCAssignment_2.model.PrintMessage;

public class App {
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Spring IOC first Assignment");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		PrintMessage pm=(PrintMessage) context.getBean("pm");
		System.out.println(pm);
		
	}

}
