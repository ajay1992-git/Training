package com.yash.E_Commerce.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdminDetails {
	Connection con=null;
	public void insertAdminDetails(String userId, String password) {
		try {
			String sql="insert into admin(userId, password)values(?,?)";
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mart", "root", "root");
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
