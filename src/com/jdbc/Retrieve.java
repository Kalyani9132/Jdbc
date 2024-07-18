package com.jdbc;
import java.sql.*;
public class Retrieve {
	
	 
	
	 
	    // Step1: Main driver method
	    public static void main(String[] args) throws ClassNotFoundException
	    {
	        // Step 2: Making connection using
	        // Connection type and inbuilt function on
	        Connection con = null;
	        PreparedStatement p = null;
	        ResultSet rs = null;
	 
	      
		    con = ConnectDB.connectDB();
	 
	        // Try block to catch exception/s
	        try {
	 
	            // SQL command data stored in String datatype
	            String sql = "select * from employee order by id";
	            p = con.prepareStatement(sql);
	            rs = p.executeQuery();
	 
	            // Printing ID, name, email of customers
	            // of the SQL command above
	            System.out.println("id\t\tname\t\taddress");
	 
	            // Condition check
	            while (rs.next()) {
	 
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String address = rs.getString("address");
	                System.out.println(id + "\t\t" + name
	                                   + "\t\t" + address+"\t\t");
	            }
	        }
	 
	        // Catch block to handle exception
	        catch (SQLException e) {
	 
	            // Print exception pop-up on screen
	            System.out.println(e);
	        }
	    }
	}


