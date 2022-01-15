package com.model.user;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.Registration;


public class UserModel {

	public void add(UserBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("Insert into registration values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, autoId());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getDOB());
		ps.setString(5, bean.getMobileNumber());
		ps.setString(6, bean.getUsername());
		ps.setString(7, bean.getPassword());
		ps.setString(8, bean.getConfirmPassword());
		ps.setString(9, bean.getEmailId());
		
		ps.executeUpdate();
		conn.commit();

		JdbcDataSource.closeConnection(conn, ps);

	}

	private static int autoId() throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select max(id) from registration");

		ResultSet rs = ps.executeQuery();
		int id = 0;
		while (rs.next()) {
			id = rs.getInt(1);
		}

		return id + 1;
	}

	public String authenticate(String emailid, String password) throws Exception {
		String e = emailid;
		String p = password;
		
		UserBean bean = new UserBean();
		

			Connection conn = JdbcDataSource.getConnection();
			PreparedStatement ps = conn
					.prepareStatement("SELECT First_Name,Email_id,Password FROM registration WHERE Email_id=? and password=?");
			ps.setString(1, e);
			ps.setString(2, p);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				bean.setFirstName(rs.getString(1));
				String email = rs.getString(2);
				String pass = rs.getString(3);
				
				
				if (email != null && pass != null) {
					System.out.println("Login Successfull");
					
				}else {
					System.out.println("Invalid login id/password");
				}
					
				}
			JdbcDataSource.closeConnection(conn, ps, rs);
			
			return bean.getFirstName();
			
	}
	public String forgotEmail(String emailid) throws Exception {
		UserBean bean = new UserBean();
		String email = emailid;
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("Select Password from registration where Email_id=?");
		ps.setString(1, email);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			bean.setPassword(rs.getString(1));
			}
		
		JdbcDataSource.closeConnection(conn, ps, rs);
		return bean.getPassword();
	}
	public static void Update(UserBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("Update registration set First_Name = ?, Last_Name= ?, dob = ?, Mobile_Number = ?, username=?, Password = ?, Confirm_Password = ?, Email_id = ? Where id = ?");
		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getDOB());
		ps.setString(4, bean.getMobileNumber());
		ps.setString(5, bean.getUsername());
		ps.setString(6, bean.getPassword());
		ps.setString(7, bean.getConfirmPassword());
		ps.setString(8, bean.getEmailId());
		ps.setString(9, bean.getId());
		
		ps.executeUpdate();
		conn.commit();
		
		JdbcDataSource.closeConnection(conn, ps);

	}

}
