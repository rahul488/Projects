package com.org.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.Bean.Signup;
import com.org.Dao.SignupDao;


/**
 * Servlet implementation class StudentSignup
 */
public class StudentSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentSignup() {
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
		int status=0;
		
		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		
		if(username.length() == 0 || username == null || password.length() == 0|| password == null) 
			rd.forward(request, response);
		else {
			Signup sp=new Signup();
			sp.setUsername(username);
			sp.setPassword(password);
			
			SignupDao spdao=new SignupDao();
			try {
				status=spdao.store(sp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(status > 0) {
			response.sendRedirect("Welcome.jsp");
		}
		
		
	}

}













