package com.org.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Forgotpw {

	

	public boolean update(String username, String password) throws Exception {
		
		Connector connector=new Connector();
		Connection con=connector.getConnection();
		
		String query="update stud set password='"+password+"' where email ='"+username+"'";
		
		Statement st=con.createStatement();
		
		int rs=st.executeUpdate(query);
		
		
		if(rs > 0 ) return true;
		return false;
	}

	
	
	
	
	
	
}
