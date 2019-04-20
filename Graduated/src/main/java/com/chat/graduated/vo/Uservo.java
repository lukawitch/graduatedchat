package com.chat.graduated.vo;

public class Uservo {
	String id;
	String pw;
	String email;
	String pwchk;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public String getPwchk() {
		return pwchk;
	}
	public void setPwchk(String pwchk) {
		this.pwchk = pwchk;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

}
