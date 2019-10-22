package com.chat.graduated.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.chat.graduated.dao.JDBCUtil;
import com.chat.graduated.vo.Groupvo;
import com.chat.graduated.vo.Uservo;

public class Grouplist {
	PreparedStatement ps =null;
	Statement sta =null;
	ResultSet rs =null;
	String sql=null;
	Connection con=null;
	Uservo user= new Uservo();
	
	/*
	public Groupvo groupex(String userid){
		Groupvo group=new Groupvo();
		JDBCUtil aa= new JDBCUtil();
		sql="select * from grouplist where userid=?";
		try {
			con=aa.testConnection();
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			rs=ps.executeQuery();
			
			while(rs.next()){
				
				group.setGpin(rs.getString("gpin"));
				group.setUserid(rs.getString("userid"));
				group.setName(rs.getString("name"));
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
		return group;
	}
*/
	public List<Groupvo> gmemberlist( String pin){
		List<Groupvo> glist=new ArrayList<Groupvo>();
		JDBCUtil aa= new JDBCUtil();
		sql="select * from grouplist where pin=?";
		try {
			con=aa.testConnection();
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, pin);
			rs=ps.executeQuery();
			while(rs.next()){
				Groupvo vo = new Groupvo();
				vo.setGpin(rs.getString("gpin"));
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setPin(rs.getString("pin"));
				glist.add(vo);
				//System.out.println("grouplist.java에서 "+vo.getUserid());
				//System.out.println("grouplis.java에서 리스트 출력"+glist.get(0).getUserid());
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
		
		return glist;
	}
	
	
	public List<Groupvo> grouplist( String userid){
		List<Groupvo> glist=new ArrayList<Groupvo>();
		JDBCUtil aa= new JDBCUtil();
		sql="select * from grouplist where userid=?";
		try {
			con=aa.testConnection();
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			rs=ps.executeQuery();
			
			while(rs.next()){
				Groupvo vo = new Groupvo();
				vo.setGpin(rs.getString("gpin"));
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setPin(rs.getString("pin"));
				glist.add(vo);
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
		return glist;
	}
	
}
