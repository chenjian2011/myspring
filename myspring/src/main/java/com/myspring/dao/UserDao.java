package com.myspring.dao;

public interface UserDao {
	public int addUser(String uname,String upassword);
	public int loginUser(String uname,String upassword);
	
	

}
