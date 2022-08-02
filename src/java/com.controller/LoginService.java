package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.LoginManager;

@WebServlet(urlPatterns = "/ls")
public class LoginService extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		LoginManager lm = new LoginManager();
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		
		try
		{
			if(lm.validate(req.getParameter("uname"), req.getParameter("pwd")))
				//pw.print("Welcome " + req.getParameter("uname"));
				res.sendRedirect("home.html");
			else
				pw.print("Invalid Credentials!...");
			
		}
		catch(Exception e)
		{
			pw.print(e.getMessage());
		}
	}
}
