package com.yash.E_Commerce.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStock {

	public void updateProduct(int productId, int quantity) {
         Connection con=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mart", "root", "root");
			PreparedStatement preparedStatement4;
			preparedStatement4 = con
					.prepareStatement("UPDATE product_detail SET quantity = ? WHERE product_id = ? ");
			preparedStatement4.setInt(1, quantity);
			preparedStatement4.setInt(2, productId);

			preparedStatement4.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
