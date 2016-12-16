package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "root");
		statement = connection.createStatement();
		String sql = "select id,name,city,zip from hello";
		ResultSet rs= statement.executeQuery(sql);
		while(rs.next()){
			System.out.println( rs.getInt(1) +"  "+rs.getString(2) +" " +rs.getString(3) + " "+rs.getString(4));
		}
		
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



	

	


