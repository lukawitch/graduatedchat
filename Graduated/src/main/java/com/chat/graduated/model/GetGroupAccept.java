package com.chat.graduated.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.chat.graduated.dao.JDBCUtil;
import com.chat.graduated.vo.GetGroupMember;
import com.chat.graduated.vo.Uservo;

public class GetGroupAccept {
	
	PreparedStatement ps =null;
	Statement sta =null;
	ResultSet rs =null;
	String sql=null;
	Connection con=null;
	ArrayList<GetGroupMember> list = new ArrayList<>();
	public ArrayList<GetGroupMember> check(String a) {
		sql=" select touser,fromuser,groupname,state from groupaccept where fromuser='"+a+"'";
		JDBCUtil aa= new JDBCUtil();
		try {
			con=aa.testConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				GetGroupMember t=new GetGroupMember();
				t.setTouser(rs.getString(1));
				t.setFromuser(rs.getString(2));  
				t.setGroupname(rs.getString(3));
				t.setState(rs.getString(4));
				list.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
			ps.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
