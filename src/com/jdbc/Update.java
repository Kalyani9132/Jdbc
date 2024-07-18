package com.jdbc;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Update  {
	   static final String URL = "jdbc:mysql://localhost:3306/empdb";
	   static final String USER = "root";
	   static final String PASS = "root";
	   static final String QUERY = "SELECT id, name,address  from employee";

	   public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {		      
	         String sql = "UPDATE employee " +
	            "SET address ='hyd' WHERE id in (2, 3)";
	         stmt.executeUpdate(sql);
	         ResultSet rs = stmt.executeQuery(QUERY);
	         while(rs.next()){
	            //Display values
	            System.out.println("ID: " + rs.getInt("id"));
	            System.out.println(" Name: " + rs.getString("name"));
	            System.out.println(" Address: " + rs.getString("address"));
	            
	         }
	         rs.close();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}


