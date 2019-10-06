package com.chat.graduated.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.ui.Model;

import com.chat.graduated.dao.JDBCUtil;

public class User {
	String id="admin";
	String t;
	PreparedStatement ps =null;
	Statement sta =null;
	ResultSet rs =null;
	String sql=null;
	Connection con=null;
	public String check(String a,String b) {
		sql="select id,pw,name from user";
		JDBCUtil aa= new JDBCUtil();
		try {
			con=aa.testConnection();
			//System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
			if(a.equals(rs.getString(1))&&b.equals(rs.getString(2))) {
	
				t=rs.getString(3);
				break;
			}
			else {
				t="admin_NO";
			}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
			ps.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
}
