package com.myspring.model;

public class UUser {
	private String uid;
	private String uname;
	private String upassword;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public UUser(String uname, String upassword) {
		super();
		this.uname = uname;
		this.upassword = upassword;
	}
    public UUser(){
    	
    }
}
