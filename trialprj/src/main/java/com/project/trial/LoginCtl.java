package com.project.trial;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.user.UserModel;
@WebServlet(name = "LoginCtl", urlPatterns = "/LoginCtl")
public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginCtl() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String l = request.getParameter("login");
		String p = request.getParameter("pass");
		try {
			if (l.equals(p)) {

				RequestDispatcher rd = request.getRequestDispatcher("/LoginView.jsp");
				request.setAttribute("errorlogin", "Please Enter LoginID");
				request.setAttribute("errorpass", "Please Enter Password");
				rd.forward(request, response);
				System.out.println("error");
			}
			if (l.equals(" ") || p.equals("")) {

				RequestDispatcher rd = request.getRequestDispatcher("/LoginView.jsp");
				request.setAttribute("errorlogin", "Please Enter LoginID");
				request.setAttribute("errorpass", "Please Enter Password");
				rd.forward(request, response);
				System.out.println("error");
			}

			if (!l.equals(p)) {

				UserModel m = new UserModel();
				String fname = m.authenticate(l, p);
				if (fname != null) {

					RequestDispatcher rd = request.getRequestDispatcher("GetCookiesCtl.do");
					request.setAttribute("fname", fname);
					Cookie ck = new Cookie("vikas",p);
					ck.setMaxAge(24*3600);
					response.addCookie(ck);
					
					HttpSession session = request.getSession(true);
					Date created = new Date(session.getCreationTime());
					Date accessed = new Date(session.getLastAccessedTime());
					
					session.setAttribute("fname", fname);
					
					System.out.println("id : "+session.getId());
					System.out.println("Created date -- "+created);
					System.out.println("Accessed Date -- "+accessed);
					
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
