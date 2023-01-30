package com.xworkz.display;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1, name = "chimpanzeeServlet",urlPatterns = "/touch")
public class ChimpanzeeServlet extends HttpServlet {
	
	public ChimpanzeeServlet() {
		System.out.println("create "+this.getClass().getSimpleName());
	}

	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("Running doPost in Chimoanzee Servlet");
		String ref1 = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		
		System.out.println("fname" + ref1);
		System.out.println("lname" + lname);
		System.out.println("email" + email);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Shows.jsp");
		request.setAttribute("fname",ref1);
		request.setAttribute("lname",lname);
		request.setAttribute("email",email);
		
		dispatcher.forward(request,response);


		
}
}

	
	
	


