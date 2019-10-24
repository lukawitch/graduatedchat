package com.chat.graduated.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.chat.graduated.dao.JDBCUtil;

public class Join {
	PreparedStatement ps =null;
	Statement sta =null;
	ResultSet rs =null;
	String sql=null;
	int c;
	Connection con=null;
	public int insert(String id,String password,String email,String name,int birth) {
	JDBCUtil aa= new JDBCUtil();
	sql="insert into user(id,pw,email,name,birth) values(?,?,?,?,?)";

	try {
		con=aa.testConnection();
		//System.out.println(name);
		ps=con.prepareStatement(sql);
		ps.setString(1,id);
		ps.setString(2,password);
		ps.setString(3,email);
		ps.setString(4,name);
		ps.setInt(5,birth);
		ps.executeUpdate();
		//System.out.println("�������Է¿Ϸ�");
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
