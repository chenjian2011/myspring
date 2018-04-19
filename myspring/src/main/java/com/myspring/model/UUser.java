package com.myspring.model;

public class UUser {
	private String uid;
	private String uname;
	private String upassword;
	private String uregtime;
	
	public String getUregtime() {
		return uregtime;
	}
	public void setUregtime(String uregtime) {
		this.uregtime = uregtime;
	}
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
	public UUser(String uname, String upassword,String uregtime) {
		super();
		this.uname = uname;
		this.upassword = upassword;
		this.uregtime = uregtime;
	}
    public UUser(){
    	
    }
}
