package com.chat.graduated.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.chat.graduated.dao.JDBCUtil;
import com.chat.graduated.vo.GetGroupMember;
import com.chat.graduated.vo.Groupvo;
import com.chat.graduated.vo.Uservo;

public class Grouplist {
	PreparedStatement ps =null;
	Statement sta =null;
	ResultSet rs =null;
	String sql=null;
	Connection con=null;

	int a;
	public int input(String userid, String name) throws Exception{
		//Groupvo group=new Groupvo();
		JDBCUtil aa= new JDBCUtil();
		sql="insert into group values(gpin.nextval,?,?)";
		try {
			con=aa.testConnection();
			System.out.println(name);
			ps=con.prepareStatement(sql);
			ps.setString(1,userid);
			ps.setString(2,name);
			ps.executeUpdate();

			System.out.println("데이터입력완료");
			a=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
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
	public ArrayList<GetGroupMember> gmemberlist(String groupname){
		ArrayList<GetGroupMember> list = new ArrayList<>();
		JDBCUtil aa= new JDBCUtil();
		sql="select * from groupaccept where groupname=?";
		try {
			con=aa.testConnection();
			//System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, groupname);
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
	
	
	public List<Groupvo> grouplist( String userid){
		List<Groupvo> glist=new ArrayList<Groupvo>();
		System.out.println("grouplist :  "+ userid);
		
		sql="select * from grouplist";// where userid='"+userid+"'";
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
				Groupvo vo = new Groupvo();
				vo.setGpin(rs.getInt("gpin"));
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setName(rs.getString("pin"));
				glist.add(vo);
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
		return glist;
	}
	
}
