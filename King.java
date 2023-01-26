package com.xworkz.king1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/king")


public class King extends HttpServlet{

  public  King() {
			System.out.println("Created"+this.getClass().getSimpleName());
		}
		
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			System.out.println("running doGet in kingServlet....");
			
			System.out.println(Thread.currentThread().getName());
			String name = req.getParameter("name");
			String region = req.getParameter("region");
			String noOfQueens = req.getParameter("noOfQueens");
			String DOB = req.getParameter("DOB");
			String DOD = req.getParameter("DOD");

			
			System.out.println(name);
			System.out.println(region);
			System.out.println(noOfQueens);
			System.out.println(DOB);
            System.out.println(DOD);

			PrintWriter writer = resp.getWriter();
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h1>");
			writer.print("<span style='color:blue'>");


			writer.print("King Name "+name + " is sent successfully.....");
			writer.print("</span>");
			writer.print("</h1>");
			writer.print("</body>");
			writer.print("</html>");
			resp.setContentType("text/html");
		
		}
		
		
		@Override
		public void destroy() {
			System.out.println("running destroy in King.....");
				
		}


}
