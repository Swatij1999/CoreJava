package com.xworkz.servletMethods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/built")

public class MobileServlet  extends HttpServlet{
	
	
	public MobileServlet() {
	System.out.println("creating "+this.getClass().getSimpleName());

}
	@Override
protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
	System.out.println("data display as doGet");
	String data="data display  as doGet........";
	PrintWriter writer=resp.getWriter();
	writer.print(data);
	resp.setContentType("text/plain");
	}
	
//	@Override
//	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
//		System.out.println("data display as doPost");
//		String data="data display as doPost........";
//		PrintWriter writer=resp.getWriter();
//		writer.print(data);
//		resp.setContentType("text/plain");
//		}
	
	@Override
	protected void doPut(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		System.out.println("data display as doPut");
		String data="data display as doPut........";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
		}
	
	
	
		@Override
		protected void doTrace(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
			System.out.println("data display as doTrace");
			String data="data display as doTrace........";
			PrintWriter writer=resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");
			}
	

		@Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("data display as init");
		}
		
		
		private void doDestoy() {
		System.out.println("display data in");

		}
		
		@Override
		protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("data display as doOption");
			String data="data display as doOption........";
			PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("data display as doPost");
			String data="data display as doPost........";
			PrintWriter writer=resp.getWriter();
			writer.print(data);
			resp.setContentType("text/plain");
		}
		
		
}