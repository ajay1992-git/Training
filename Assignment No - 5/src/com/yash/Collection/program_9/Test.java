package com.yash.Collection.program_9;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
	
	 public static void main(String[] args) {
	        CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();
	        Employee employee1 = new Employee(101, "ajay", 1000, "dev", "nagpur");
	        Employee employee2 = new Employee(103, "sanket",2000, "dev", "indore");
	        Employee employee3 = new Employee(102, "sumit", 4000, "dev", "mumbai");



	       empList.add(employee1);
	        empList.add(employee2);
	        empList.add(employee3);
	        for (Employee employee : empList) {
	            int objectElement = employee.getEid();
	            int index = objectElement % 10;
	            empList.add(index, employee);
	        }
	        empList.forEach(System.out::println);
	    }

 }
	


