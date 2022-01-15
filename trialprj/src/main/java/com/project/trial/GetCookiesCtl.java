package com.project.trial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GetCookiesCtl", urlPatterns = "/GetCookiesCtl.do")
public class GetCookiesCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetCookiesCtl() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] c= request.getCookies();
		for (int i = 0; i < c.length; i++) {
			Cookie ck = c[i];
			String name = ck.getName();
			String value = ck.getValue();
			System.out.println(name + " = "+value);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WelcomeView.jsp");
			rd.forward(request, response);
		}
	}

}
