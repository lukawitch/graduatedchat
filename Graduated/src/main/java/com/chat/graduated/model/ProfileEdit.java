package com.chat.graduated.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.chat.graduated.dao.JDBCUtil;

public class ProfileEdit {
	String id="admin";
	int t;
	PreparedStatement ps =null;
	Statement sta =null;
	ResultSet rs =null;
	String sql=null;
	int c;
	Connection con=null;
	public void update(String id,String password,String email,String name) {
	JDBCUtil aa= new JDBCUtil();
	sql="update user set name=?,email=?,pw=? where id=?";

	try {
	
		con=aa.testConnection();
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(id);
		ps=con.prepareStatement(sql);
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,password);
		ps.setString(4,id);
		
		ps.executeUpdate();
		System.out.println("데이터입력완료");
	
	}catch (Exception e) {
		
		e.printStackTrace();
	}
	

		

	try {
		con.close();
		ps.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
