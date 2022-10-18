package com.yash.E_Commerce.project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminDisplay {
	
	public void CheckProductQuantity() throws SQLException
	{
		Connection connection=null;
		Scanner scanner=new Scanner(System.in);
		int product_id;
		String username;
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mart", "root", "root");
		
		try{
			
			System.out.println("Which products available quantity you want to check?");
			System.out.println("Enter the product_id : ");
			product_id=scanner.nextInt();
			
			
			PreparedStatement preparedStatement1=connection.prepareStatement("select * from product_detail where product_id=?");
			preparedStatement1.setInt(1, product_id);
			ResultSet resultSet1=preparedStatement1.executeQuery();
		
		
				if(resultSet1.next())
				{
					System.out.println("product_id : "+resultSet1.getInt(1));
					System.out.println("product_name : "+resultSet1.getString(2));
					System.out.println("quantity : "+resultSet1.getInt(5));
					System.out.println("-------------------------------------------");
				}
		       else {
			System.out.println("Plese enter the valid product_id ..");
			product_id=scanner.nextInt();
			preparedStatement1.setInt(1, product_id);
			resultSet1=preparedStatement1.executeQuery();
			while(resultSet1.next())
			{
				System.out.println("product_id : "+resultSet1.getInt(1));
				System.out.println("product_name : "+resultSet1.getString(2));
				System.out.println("quantity : "+resultSet1.getInt(5));
				System.out.println("-------------------------------------------");
			}
		}
				System.out.println("Below is the customers purchase History >>");
				System.out.println("Enter the userName of Customer to check history");
				username=scanner.next();
				
				PreparedStatement preparedStatement2=connection.prepareStatement("select * from cart where username=?");
				preparedStatement2.setString(1, username);
				ResultSet resultSet2=preparedStatement2.executeQuery();
			
			
					while(resultSet2.next())
					{
						System.out.println("product_id : "+resultSet2.getInt(2));
						System.out.println("product_name : "+resultSet2.getString(3));
						System.out.println("quantity : "+resultSet2.getInt(5));
						System.out.println("total_price: "+resultSet2.getInt(4));
						System.out.println("-------------------------------------------");
					}
					System.out.println("Below is the user History>>");
					int srNo=0;
					for(int i=1;i<=50;i++) {
						srNo=i;
						PreparedStatement preparedStatement5=connection.prepareStatement("select * from user where srNo=?");
						preparedStatement5.setInt(1, srNo);
						ResultSet resultSet5=preparedStatement5.executeQuery();
					
					
							while(resultSet5.next())
							{
								System.out.println("FirstName : "+resultSet5.getString(2));
								System.out.println("LastName : "+resultSet5.getString(3));
								System.out.println("EmailId : "+resultSet5.getString(4));
								System.out.println("mobileNo : "+resultSet5.getString(5));
								System.out.println("-------------------------------------------");
							}	
					}
					
				
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
