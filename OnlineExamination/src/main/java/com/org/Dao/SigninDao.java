package com.org.Dao;

import java.sql.Connection;
import java.sql.*;



public class SigninDao {
	
	
	public boolean validate(String username, String password) throws Exception {
		return validQuery(username,password);
		
	}

	private boolean validQuery(String username, String password) throws Exception {
		Connector connector=new Connector();
		Connection con=connector.getConnection();
		
		String Query="select password from stud where email = '"+username+"' ";
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		
		boolean status=rs.next();
		if(status) {
			String pass=rs.getString(1);
			if(password.equals(pass))
				return true;
		}
		
		return false;
	}
	
}
