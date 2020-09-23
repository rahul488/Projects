package com.org.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.org.Bean.Question;

public class QuestionDao {
	Connection con=null;
	public void insertQuestion(Question q) throws Exception {
		Connector connector=new Connector();
		con=connector.getConnection();
		storeData(con,q);
	}
	private void storeData(Connection con, Question q) {
		String query="insert into question values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1,q.getQuestion());
			st.setString(2,q.getOption1());
			st.setString(3,q.getOption2());
			st.setString(4,q.getOption3());
			st.setString(5,q.getOption4());
			st.setString(6,q.getAns());
			
			
			int rows=st.executeUpdate();
			
			st.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
