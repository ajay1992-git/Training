package com.yash.E_Commerce.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AddToCart {

	public void addToCart(String userId) {
		Scanner scanner1 = new Scanner(System.in);
		String yn;
		do {
		Connection con=null;
		try {

			int productId1 = 0;
			int productPrice1, productQuantity1 = 0;
			String productName1 = null;

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mart", "root", "root");
			
			System.out.println("Please provide productId and quantity you want to buy>>");
			System.out.println("Enter productId>>");
			int productId = scanner1.nextInt();

			PreparedStatement preparedStatement = con
					.prepareStatement("select product_id from product_detail where product_id= '" + productId + "'");
			ResultSet b = preparedStatement.executeQuery();
			
			if(!b.next()) {
				System.out.println("Please enter valid productId>>");
				productId = scanner1.nextInt();
			}

			System.out.println("Enter quantity>>");
			int quantity = scanner1.nextInt();

			PreparedStatement preparedStatement2 = con
					.prepareStatement("select * from product_detail where product_id = ?");

			preparedStatement2.setInt(1, productId);

			ResultSet resultSet2 = preparedStatement2.executeQuery();

			PreparedStatement preparedStatement4 = con
					.prepareStatement("select * from product_detail where product_id = ?");

			preparedStatement4.setInt(1, productId);

			ResultSet resultSet4 = preparedStatement4.executeQuery();

			int quantityFromDb = 0;

			while (resultSet4.next()) {
				quantityFromDb = resultSet4.getInt(5);
			}

			if (quantity > quantityFromDb) {

				System.out.println("Invalid quantity, please check the stock and try again>>");
				System.out.println("We have = " + quantityFromDb);
				System.out.println("You have entered " + quantity);
				System.out.println("Enter quantity>>");
				quantity = scanner1.nextInt();

			}

			if (quantity <= quantityFromDb) {
				System.out.println("Your cart is>>");

				while (resultSet2.next()) {

					System.out.println("Product Id= " + resultSet2.getInt(1));
					productId1 = resultSet2.getInt("product_id");

					System.out.println("Product Name= " + resultSet2.getString(2));
					productName1 = resultSet2.getString("product_name");
					
					System.out.println("Product Description= " + resultSet2.getString(3));

					System.out.println("Price Per Product= " + resultSet2.getInt(4));
					productPrice1 = resultSet2.getInt("price");
					System.out.println("Total Price= "+productPrice1*quantity);

					System.out.println("Initial Product Quantity= " + resultSet2.getInt(5));
					productQuantity1 = resultSet2.getInt("quantity");

					System.out.println("============================");
					System.out.println();

					PreparedStatement preparedStatement3 = con.prepareStatement(
							"insert into cart(product_id,product_name,total_price,quantity,username) values (?,?,?,?,?)");

					preparedStatement3.setInt(1, productId1);
					preparedStatement3.setString(2, productName1);
					preparedStatement3.setInt(3, productPrice1 * quantity);
					preparedStatement3.setInt(4, quantity);
					preparedStatement3.setString(5, userId);

					preparedStatement3.execute();
					System.out.println("Item added to cart>>");
				}
			}
			
			UpdateStock updateStock = new UpdateStock();
			updateStock.updateProduct(productId1, productQuantity1 - quantity);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Do you want to add more product into cart? Type Y for yes and N for No");
		yn=scanner1.next();
		}while((yn.equals("Y")) || (yn.equals("y")));

	}
}

