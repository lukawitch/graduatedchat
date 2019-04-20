package com.chat.graduated;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;

public class mysqltest1 {



	private static final String DRIVER = "com.mysql.cj.jdbc.Driver"; 
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/graduated?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC"; 
	private static final String USER = "graduated"; 
	private static final String PW = "graduated"; 
	@Test 
	public void testConnection() throws Exception{ 
		Class.forName(DRIVER); 
		try(Connection conn = DriverManager.getConnection(URL, USER, PW)){ 
			System.out.println("연결성공");
			System.out.println(conn); // 콘솔창에서 연결정보를 출력하여 확인한다. 
			} 
			catch (Exception e) { // TODO: handle exception
			System.out.println(e);	
			} }
		
	}



