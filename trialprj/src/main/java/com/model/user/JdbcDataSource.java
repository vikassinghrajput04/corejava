package com.model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {
	
	
	                                   
	// JDBC Datasource static object
	private static JdbcDataSource jds = null;
	
	//C3P0 database connection pool
	private ComboPooledDataSource ds  = null;
	
	//make default constructor private
	private JdbcDataSource() {
		ResourceBundle rb = ResourceBundle.getBundle("com.model.user.app");
		
		try {
			// create data source 
			ds = new ComboPooledDataSource();
			//set ds properties
			ds.setDriverClass(rb.getString("Driver"));
			ds.setJdbcUrl(rb.getString("url"));
			ds.setUser(rb.getString("username"));
			ds.setPassword(rb.getString("password"));
			ds.setInitialPoolSize(1);
			ds.setAcquireIncrement(1);
			ds.setMaxPoolSize(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//get singleton class instance
	public static JdbcDataSource getInstance() {
		if (jds == null) {
			jds = new JdbcDataSource();
		}
		return jds;
	}
	
	//get connection from DCP
	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
		} catch (SQLException e) {
			return null;
		}
	}
	
	//close connection
	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
	//close connection
	public static void closeConnection(Connection conn) throws Exception {
		closeConnection(conn, null, null);
	}
	public static void closeConnection(Connection conn, PreparedStatement ps) {
		try {
			
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
	}
	public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) throws Exception{
		conn.close();
		ps.close();
		rs.close();
	}
	
	
}
