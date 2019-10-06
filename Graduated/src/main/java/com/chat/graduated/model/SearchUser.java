package com.chat.graduated.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.chat.graduated.dao.JDBCUtil;
import com.chat.graduated.vo.Uservo;
import com.chat.graduated.vo.Groupvo;

public class SearchUser {
	Uservo t=new Uservo();
	PreparedStatement ps =null;
	Statement sta =null;
	ResultSet rs =null;
	String sql=null;
	Connection con=null;
	public Uservo check(String a) {
		sql="select id,name from user where id='"+a+"'";
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
				t.setId(rs.getString(1));
				t.setName(rs.getString(2));  
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
	public Uservo makeGroupUserSearch(String search){ //검색하면 이름/아이디 출력 
		Uservo vo = new Uservo();
		sql="select * from user where id='"+search+"' or name='"+search+"'";
		JDBCUtil aa= new JDBCUtil();
		try {
			con=aa.testConnection();
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				vo.setId(rs.getString(1));
				vo.setName(rs.getString(2));
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

		return vo;
	}
}

