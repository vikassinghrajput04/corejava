package com.project.trial;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.user.UserBean;
import com.model.user.UserModel;

public class RgistrationCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RgistrationCtl() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * String fname = request.getParameter("fname"); String lname =
		 * request.getParameter("lname"); String dob = request.getParameter("dob");
		 * String mobile = request.getParameter("mobile"); String
		 * emailid=request.getParameter("emailid"); String username =
		 * request.getParameter("username"); String password =
		 * request.getParameter("password]"); String confirmpassword =
		 * request.getParameter("confirmpassword");
		 * 
		 * UserBean bean = new UserBean(); bean.setFirstName(fname);
		 * bean.setLastName(lname); bean.setDOB(dob); bean.setMobileNumber(mobile);
		 * bean.setEmailId(emailid); bean.setUsername(username);
		 * bean.setPassword(password); bean.setConfirmPassword(confirmpassword);
		 * 
		 * UserModel m = new UserModel(); try { m.add(bean); } catch (Exception e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * PrintWriter out = response.getWriter(); out.print("Registration Success");
		 */

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String dob = request.getParameter("dob");
		String mobile = request.getParameter("mobile");
		String emailid = request.getParameter("emailid");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("confirmpassword");

		UserBean bean = new UserBean();
		bean.setFirstName(fname);
		bean.setLastName(lname);
		bean.setDOB(dob);
		bean.setMobileNumber(mobile);
		bean.setEmailId(emailid);
		bean.setUsername(username);
		bean.setPassword(password);
		bean.setConfirmPassword(confirmpassword);

		UserModel m = new UserModel();
		try {
			m.add(bean);
			response.sendRedirect("LoginView.jsp");
		} catch (Exception e) {

			
			  RequestDispatcher rd=
			  request.getRequestDispatcher("/UserRegistrationView.jsp");
			  request.setAttribute("error", "Invalid Credentials"); rd.forward(request,
			  response);
			 
		}

	}

}
