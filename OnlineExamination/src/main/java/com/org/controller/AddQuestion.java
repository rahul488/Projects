package com.org.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.Bean.Question;
import com.org.Dao.QuestionDao;


public class AddQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String question=request.getParameter("question");
		String option1=request.getParameter("op1");
		String option2=request.getParameter("op2");
		String option3=request.getParameter("op3");
		String option4=request.getParameter("op4");
		String ans=request.getParameter("ans");
		
		Question q=new Question();
		q.setQuestion(question);
		q.setOption1(option1);
		q.setOption2(option2);
		q.setOption3(option3);
		q.setOption4(option4);
		q.setAns(ans);
		
		QuestionDao dao=new QuestionDao();
		try {
			dao.insertQuestion(q);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			response.sendRedirect("CreateQuestion.jsp");
		}
		
		
	}

}
