package com.org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.Dao.SigninDao;

/**
 * Servlet implementation class Studentsignin
 */
public class Studentsignin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studentsignin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(username.length() == 0 || username == null || password.length()==0 || password == null)
			response.sendRedirect("StudentPage.jsp");
		boolean status=false;
		SigninDao signin=new SigninDao();
		try {
			status=signin.validate(username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(status) {
			response.sendRedirect("Exam.jsp");
		}
		else {
			PrintWriter out=response.getWriter();
			out.println("You have enter invalid username or password");
		}
	}

}
