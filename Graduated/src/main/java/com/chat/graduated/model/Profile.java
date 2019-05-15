package com.chat.graduated.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chat.graduated.dao.JDBCUtil;
import com.chat.graduated.vo.Uservo;

public class Profile extends HttpServlet {

	PreparedStatement ps =null;
	Statement sta =null;
	ResultSet rs =null;
	String sql=null;
	int c;
	Connection con=null;
	public Uservo select(String id) {
		Uservo user = new Uservo();
		/*
		System.out.println(id);
		JDBCUtil aa= new JDBCUtil();
	
		
		try {
			sta = con.createStatement();
			 ResultSet rs =sta.executeQuery(sql);
			 
					while(rs.next()){
						user.setEmail(rs.getString(3));
						user.setName(rs.getString(4));
						 		 		
					
				} 
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return user;
	}*/
		sql="select * from user where id='"+id+"'";
		JDBCUtil aa= new JDBCUtil();
		try {
			con=aa.testConnection();
			System.out.println("연결완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				user.setEmail(rs.getString(3));
				user.setName(rs.getString(4));
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
		return user;
	}
		
}
