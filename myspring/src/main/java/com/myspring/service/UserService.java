package com.myspring.service;

import com.myspring.daoimpl.UserDaoImpl;

public class UserService {
	private UserDaoImpl udi;
	public int addUser(String uname,String upassword){
		udi.addUser(uname, upassword);
		return 1;
		
	}

}
