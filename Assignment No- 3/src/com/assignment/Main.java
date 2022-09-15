package com.assignment;

import java.util.Date;

public class Main {
	 public static void main(String[] args) {
	        
	        Employee emp= new Employee();
	        emp.setEmpid(111);
	        emp.setEmpname("ajay");
	        emp.setEmpsalary(50000);
	        emp.setEmpaddress("pune");
	        emp.setEmp_dob(new Date(26-12-1995));
	        emp.setEmp_doj(new Date(11-07-2022));
	        System.out.println(emp);
	    
	 }

}
