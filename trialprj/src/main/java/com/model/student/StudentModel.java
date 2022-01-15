package com.model.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.user.JdbcDataSource;

public class StudentModel {

	public static void add(StudentBean bean) throws Exception {
		
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("insert into Student Values(?,?,?,?)");
		ps.setString(1, bean.getRollNo());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getSession());

		ps.executeUpdate();
		
		conn.commit();
		System.out.println("Inserted!!!!!");
		JdbcDataSource.closeConnection(conn, ps);
		
		
	}
public static  void Update(StudentBean bean) throws Exception {
		
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("update Student set Fname=?,Lname=?,Session=? Where RollNo = ?");
		ps.setString(1, bean.getFname());
		ps.setString(2, bean.getLname());
		ps.setString(3, bean.getSession());
		ps.setString(4, bean.getRollNo());
		ps.executeUpdate();
		
		conn.commit();
		System.out.println("Updated!!!!!");
		JdbcDataSource.closeConnection(conn, ps);
}
public static void Get(StudentBean bean) throws Exception {
	
	Connection conn = JdbcDataSource.getConnection();
	PreparedStatement ps = conn.prepareStatement("Select * From Student Where RollNo = ?");
	ps.setString(1, bean.getRollNo());
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.println(rs.getString(4)+"\t");
	}
JdbcDataSource.closeConnection(conn, ps, rs);

}
public static  void Delete(StudentBean bean) throws Exception {
	
	Connection conn = JdbcDataSource.getConnection();
	PreparedStatement ps = conn.prepareStatement("Delete From Student Where RollNo = ?");
	ps.setString(1, bean.getRollNo());
	ps.executeUpdate();
	
	System.out.println("Deleted!!!!!");
 JdbcDataSource.closeConnection(conn, ps);

}
public static  void Search(StudentBean bean) throws Exception {
	
	Connection conn = JdbcDataSource.getConnection();
	PreparedStatement ps = conn.prepareStatement("Select * From Student Where Fname = ?");
	ps.setString(1, bean.getFname());
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.println(rs.getString(4)+"\t");
	}
JdbcDataSource.closeConnection(conn, ps, rs);

}
}
