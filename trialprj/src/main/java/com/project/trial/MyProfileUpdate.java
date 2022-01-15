package com.project.trial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="MyProfileUpdate", urlPatterns = "/MyProfile.do")
public class MyProfileUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyProfileUpdate() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String dob = request.getParameter("dob");
		String mob = request.getParameter("mobile");
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		String confirmpass = request.getParameter("confirmpassword");
		String email = request.getParameter("emailid");
		
		
		
	}

}
