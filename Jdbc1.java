package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");
			statement = connection.createStatement();
			String sql = "insert into hello values(2,'praveen','newyork','2456')";
			statement.executeUpdate(sql);
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
		
	

			
		


