package com.org.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
	
	String url="jdbc:mysql://localhost:3306/student";
	String user="root";
	String pass="7894";
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		return con;
	}

}
