package com.xworkz.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1, name = "chimpanzeeServlet",urlPatterns = "/touch")

public class JspProject extends HttpServlet{
	
	public JspProject() {
		System.out.println("Created" + this.getClass().getSimpleName());	
	}
	
	protected void doPost(HttpServletRequest req,HttpServletResponse   resp)throws ServletException,IOException{
	System.out.println("Running dopost in JspProject");
	
	String firstName=req.getParameter("firstName");
	String lastName=req.getParameter("lastName");
	String gender=req.getParameter("gender");
	String reason=req.getParameter("reason");
	String address=req.getParameter("address");

	
	
	System.out.println("firstName" + firstName);
	System.out.println("lastName" + lastName);
	System.out.println("gender" + gender);
	System.out.println("reason" + reason);
	System.out.println("address" + address);

	
	RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
	
	req.setAttribute("firstName", firstName);
	req.setAttribute("lastName", lastName);
	req.setAttribute("gender",gender );
	req.setAttribute("reason",reason );
	req.setAttribute("address",address );

	dispatcher.forward(req, resp);
	
	}
	

}
