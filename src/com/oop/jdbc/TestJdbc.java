package com.oop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  TestJdbc{

	
	public static void main(String[] args) {
		
		
	String HOSTNAME = "localhost";
	String DBNAME = "codefest";
	String USERNAME = "root";
	String PASSWORD = "";
    String PORT = "3306";
	 	
	Connection connection;
		try {
				Class.forName("com.mysql.jdbc.Driver");
				String connectionURL = "jdbc:mysql://" + HOSTNAME + ":"+PORT+"/" + DBNAME;
				connection = DriverManager.getConnection(connectionURL, USERNAME,
			             PASSWORD);
				System.out.println("Connection established");

		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
