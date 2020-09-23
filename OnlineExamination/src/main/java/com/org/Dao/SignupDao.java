package com.org.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.org.Bean.Signup;

public class SignupDao {

	public int store(Signup sp) throws Exception {
		Connector connector=new Connector();
		return storeData(sp,connector);
	}

	private int storeData(Signup sp,Connector connector) throws Exception {
		
		String query="insert into stud values(?,?)";
		
		Connection con=connector.getConnection();
		
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, sp.getUsername());
		pst.setString(2, sp.getPassword());
		
		int rs=pst.executeUpdate();
		
		pst.close();
		con.close();
		
		return rs;
	}

}
