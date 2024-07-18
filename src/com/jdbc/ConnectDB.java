package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	static Connection con = null;

	public static Connection connectDB() throws ClassNotFoundException

	{

		Class.forName("com.mysql.jdbc.Driver");

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;


	}
}
