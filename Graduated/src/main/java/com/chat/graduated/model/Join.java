package com.chat.graduated.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.chat.graduated.dao.JDBCUtil;

public class Join {
	String id="admin";
	int t;
	PreparedStatement ps =null;
	Statement sta =null;
	ResultSet rs =null;
	String sql=null;
	int c;
	Connection con=null;
	public int insert(String id,String password,String email) {
	JDBCUtil aa= new JDBCUtil();
	sql="insert into user values(?,?,?)";

	try {
	
		con=aa.testConnection();
		System.out.println(con);
		ps=con.prepareStatement(sql);
		ps.setString(1,id);
		ps.setString(2,password);
		ps.setString(3,email);
		ps.executeUpdate();
		System.out.println("데이터입력완료");
		c=0;
	}catch (Exception e) {
		c=1;
		e.printStackTrace();
	}
	

		

	try {
		con.close();
		ps.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return c;
	}
}
