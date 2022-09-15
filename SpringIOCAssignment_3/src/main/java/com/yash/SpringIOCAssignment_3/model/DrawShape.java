package com.yash.SpringIOCAssignment_3.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawShape {

	public static void main(String[] args) {
		

		System.out.println("Welcome to Spring IOC 3rd Assignment");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Shape s1=(Rectangle) context.getBean("rectangle");
		Shape s2=(Parallelogram) context.getBean("Parallelogram");
		Shape s3=(Triangle) context.getBean("Triangle");
		
		s1.draw();
		s2.draw();
		s3.draw();
		
	}
}
