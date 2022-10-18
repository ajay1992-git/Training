package com.yash.E_Commerce.project;

import java.util.Scanner;

public class LoginDisplay {

	public void login() {
		String yn;
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to Y Mart");
		
		System.out.println("Please Select the login category");
		System.out.println("Admin or User?");
        yn=s.next(); 
        if((yn.equals("user")||yn.equals("User"))) {
        	Productdisplay pd1=new Productdisplay();
        	pd1.userInput();
        	
        	
        }else if((yn.equals("Admin")||yn.equals("admin"))){
        	Admin a=new Admin();
        	a.adminDetails();
        	
        	
        }else {
        	System.out.println("Invalid input");
        }
		
	}
}
