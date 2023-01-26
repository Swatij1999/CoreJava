package com.xworkz.webseries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/webseries")

public class WebSeries extends HttpServlet {

		public  WebSeries() {
			System.out.println("Created"+this.getClass().getSimpleName());
		}
		
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			System.out.println("running doGet in webSeriesServlet....");
			
			System.out.println(Thread.currentThread().getName());
			String name = req.getParameter("name");
			String lang = req.getParameter("lang");
			String episodes = req.getParameter("episodes");
			String ott = req.getParameter("ott");
			String budget = req.getParameter("budget");

			
			System.out.println(name);
			System.out.println(lang);
			System.out.println(episodes);
			System.out.println(ott);
            System.out.println(budget);

			PrintWriter writer = resp.getWriter();
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h1>");
			writer.print("<span style='color:blue'>");


			writer.print("Webseries Name "+name + " is sent successfully.....");
			writer.print("</span>");
			writer.print("</h1>");
			writer.print("</body>");
			writer.print("</html>");
			resp.setContentType("text/html");
		
		}
		
		
		@Override
		public void destroy() {
			System.out.println("running destroy in WebSeries.....");
				
		}


}
