package com.model.user;

public class TestUser {
	
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testEmail();
		testForgotEmail();
		
	}

	public static void testEmail() throws Exception {
		UserModel u = new UserModel();
		u.authenticate("vikassinghr786@gmail.com", "12345");
		
	}
	public static void testForgotEmail() throws Exception {
		UserModel m = new UserModel();
		String pass = m.forgotEmail("praveen2601@gmail.com");
		System.out.println(pass);
	}

	public static void testAdd() throws Exception {
		UserBean bean = new UserBean();
		bean.setFirstName("Vikas");
		bean.setLastName("Rajput");
		bean.setDOB("04/08/2001");
		bean.setMobileNumber("6264816842");
		bean.setEmailId("vikassinghr786@gmail.com");
		bean.setUsername("vikas0408");
		bean.setPassword("vikas123");
		bean.setConfirmPassword("vikas123");
		
		UserModel m = new UserModel();
		m.add(bean);
	}
}
