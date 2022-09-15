package com.yash.SpringIOCAssignment_1.model.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.SpringIOCAssignment_1.model.Employee;

public class App {
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Spring IOC first Assignment");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee e=(Employee) context.getBean("employee");
		System.out.println(e);
		
	}

}
