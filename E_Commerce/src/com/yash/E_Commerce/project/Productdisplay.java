package com.yash.E_Commerce.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Productdisplay {
	
	Scanner s=new Scanner(System.in);
	public void userInput() {
		String yn;
		System.out.println("Already a member? Type Y for yes and N for no>");
		yn=s.next();
		if ((yn.equals("Y")) || (yn.equals("y"))) {
			System.out.println("Enter your userId ");
			String userId=s.next();
			System.out.println("Enter your Password");
			String password=s.next();
			Connection con=null;
			try {
	         String sql="SELECT * FROM user where userId='"+userId+"'and password='"+password+"'";
				
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mart", "root", "root");
		    PreparedStatement ps=con.prepareStatement(sql);
		    
		    ResultSet rs=ps.executeQuery(sql);
		    if(rs.next()) {
		    	
		    	DisplayProduct dp=new DisplayProduct();
		    	dp.displayItems();
		    	AddToCart addToCart=new AddToCart();
				addToCart.addToCart(userId);
		    }else {
		    	System.out.println("Enter correct userId or Password");
		    }
		    
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
                try {
					con.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		}else {
		
		System.out.println("Please Register first");
		System.out.println("Enter your FirstName");
		String fName=s.next();
		System.out.println("Enter your Last Name");
		String lName=s.next();
		System.out.println("Enter your email id");
		String emailid=s.next();
		System.out.println("Enter your Mobile Number");
		String mobileNo=s.next();
		System.out.println("Enter userId you want to set");
		String userId=s.next();
		System.out.println("Enter Your password you want to set");
		String password=s.next();
		
		UserDetails u=new UserDetails();
		System.out.println("Registration Successfull");
		System.out.println("Select the Product you want to buy>>");
		u.userInfo(fName, lName, emailid, mobileNo,userId, password);
		
		DisplayProduct dp=new DisplayProduct();
    	dp.displayItems();
    	AddToCart addToCart=new AddToCart();
		addToCart.addToCart(userId);
		}
		}
	
	
	
}
