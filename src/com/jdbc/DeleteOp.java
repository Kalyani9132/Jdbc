package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOp {
	public static void main(String[] args) throws ClassNotFoundException {

		PreparedStatement p = null;
		Connection con = ConnectDB.connectDB();
		try {
			String sql = "delete from employee where id=1";
			p = con.prepareStatement(sql);
			p.execute();
		} catch (SQLException e) {
			System.out.println(e);

		}
	}

}
