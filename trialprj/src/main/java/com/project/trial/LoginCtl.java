package com.project.trial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.user.UserModel;


public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginCtl() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	
		Cookie[] cookies = request.getCookies();
		for(int i = 0;i<cookies.length;i++){
			Cookie c = cookies[i];
			String name = c.getName();
			String value = c.getValue();
			//out.println(name +  " = " + value);

		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String l = request.getParameter("login");
		String p = request.getParameter("pass");
		Cookie ck = new Cookie(l, p);
		ck.setMaxAge(24*60);
		response.addCookie(ck);
		try {
	if (l.equals(p) )  {
		
			RequestDispatcher rd = request.getRequestDispatcher("/LoginView.jsp");
			request.setAttribute("errorlogin", "Please Enter LoginID");
			request.setAttribute("errorpass", "Please Enter Password");
			rd.forward(request, response); 
			System.out.println("error");
		}	
	if (l.equals(" ") || p.equals("") )  {
		
		RequestDispatcher rd = request.getRequestDispatcher("/LoginView.jsp");
		request.setAttribute("errorlogin", "Please Enter LoginID");
		request.setAttribute("errorpass", "Please Enter Password");
		rd.forward(request, response); 
		System.out.println("error");
	}	

	

		if (!l.equals(p) ) {
		
			UserModel m = new UserModel();
				String fname = m.authenticate(l, p);
				if (fname != null) {
					
					RequestDispatcher rd = request.getRequestDispatcher("/WelcomeView.jsp");
					request.setAttribute("fname", fname);
					rd.forward(request, response);
					} else {
							RequestDispatcher rd = request.getRequestDispatcher("/LoginView.jsp");
							request.setAttribute("error", "Invalid Email-Id / Password");
							rd.forward(request, response);	
								}
					
		}
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
}
