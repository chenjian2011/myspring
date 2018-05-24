package com.myspring.utils;



public class MyConnectionPool {
	private static MyConnectionPool myConnectionPool= null;
	private MyConnectionPool(){
		
	}
	
	public static synchronized MyConnectionPool getInstance(){
		if(null==myConnectionPool)
			myConnectionPool =  new MyConnectionPool();
		return myConnectionPool;
		
	}

}
