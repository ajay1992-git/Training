package com.yash.E_Commerce.project;

import java.sql.SQLException;
import java.util.Scanner;

public class Admin {

	public void adminDetails() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the userId");
		String userId=s.next();
		System.out.println("Enter the password");
		String password=s.next();
		AdminDetails a=new AdminDetails();
		a.insertAdminDetails(userId, password);
		if(userId.equals("GroupY") && password.equals("teamof4")) {
			AdminDisplay adminDisplay=new AdminDisplay();
			try {
				adminDisplay.CheckProductQuantity();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Invalid UserId or Password");
		}
		
		
		
	}
}
