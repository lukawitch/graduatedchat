package com.chat.graduated.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.chat.graduated.dao.JDBCUtil;
import com.chat.graduated.vo.Uservo;

public class SearchUserMember {
	
	PreparedStatement ps =null;
	Statement sta =null;
	ResultSet rs =null;
	String sql=null;
	Connection con=null;
	ArrayList<Uservo> list = new ArrayList<>();
	public ArrayList<Uservo> check(String a) {
		sql="select member,name from usermember where user='"+a+"'";
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
				Uservo t=new Uservo();
				t.setId(rs.getString(1));
				t.setName(rs.getString(2));  
				list.add(t);
				/*System.out.println(t.getId());
				System.out.println(t.getName());*/
				
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
		return list;
	}
}
