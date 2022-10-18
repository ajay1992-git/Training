package com.yash.E_Commerce.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayProduct {

	
	  public void displayItems() {
	  System.out.println("Successfull you can start shopping"); Connection
	  con=null; try { String
	  sql="SELECT * FROM product_detail ORDER BY product_name ASC";
	  
	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mart", "root",
	  "root"); PreparedStatement ps=con.prepareStatement(sql);
	  
	  ResultSet rs=ps.executeQuery(sql);
	  
	  System.out.println("Following is the products list "+rs); while(rs.next()) {
	  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)
	  +"  "+rs.getString(4)+" "+rs.getString(5));
	  System.out.println("============================"); System.out.println();
	  
	  
	  } }catch(Exception e) { e.printStackTrace();
	  
	  }finally { try { con.close(); }catch(Exception e1) { e1.printStackTrace(); }
	  } }
	 
	public static void main(String[] args) {
		LoginDisplay l=new LoginDisplay();
		l.login();
		
		
	}
}
