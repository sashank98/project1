package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Jdbc3 {

	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");
		
			String sql = "insert into hello values(?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, 4);
			statement.setString(2, "david");
			statement.setString(3, "gerogia");
			statement.setString(4, "9876");
			statement.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(statement != null){
					statement.close();
				}
			if(connection !=null){
				statement.close();
			}
			}catch (SQLException e) {
        	 e.printStackTrace();

			}
		}
	}

}
