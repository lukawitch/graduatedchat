package com.chat.graduated.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	  //String URL = "jdbc:mysql://127.0.0.1:3306/graduated?useUnicode=true&characterEncoding=utf8&verifyServerCertificate=false&useSSL=false&serverTimezone=UTC";
	String URL ="jdbc:mysql://127.0.0.1:3306/graduated?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
	String USER = "graduated";
	     String PW = "graduated";

	    public Connection testConnection() throws Exception {
	        try{
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        }
	        catch (Exception e) {
	        	System.out.println("���ῡ��");
			}
	        Connection conn = DriverManager.getConnection(URL, USER, PW);
	     
	            
	            return conn;
	      	    }
}
