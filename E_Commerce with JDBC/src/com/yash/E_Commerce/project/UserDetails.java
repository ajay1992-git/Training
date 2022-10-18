package com.yash.E_Commerce.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDetails {
	
	
	
	public void userInfo(String fName, String lName,String emailid, String mobileNo,String userId,String password) {
		Connection con=null;
		
		Productdisplay p=new Productdisplay();
		
		try {
			String sql="insert into user(fName,lName,emailid,mobileNo,userId,password)values(?,?,?,?,?,?)";
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mart", "root", "root");
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,fName);
			ps.setString(2,lName);
			ps.setString(3,emailid);
			ps.setString(4,mobileNo);
			ps.setString(5,userId);
			ps.setString(6,password);
		
			int i=ps.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			
		}
	}
        
}
