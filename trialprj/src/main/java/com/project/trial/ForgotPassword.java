package com.project.trial;


import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.user.UserModel;


public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ForgotPassword() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String e = request.getParameter("emailid");
		
		
		
		UserModel u = new UserModel();
		try {
			String pass = u.forgotEmail(e);
			request.setAttribute("pass", pass);
			request.setAttribute("error", "Invalid Email-ID");
			if (pass!=null) {
				RequestDispatcher rd = request.getRequestDispatcher("/ShowMyPassword.jsp");
				
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("/ForgotPasswordView.jsp");
				
				rd.forward(request, response);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
