package com.proud.test;

import com.mongodb.Mongo;
import com.mongodb.client.MongoDatabase;

public class Test_Git {
	
	public static final String ip="192.168.1.116";
	
	static {
		try {
			init();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("test git first time!!!");
	}

	private static void init() {
		//String ip="192.168.1.116";
		//MongoDatabase mongoDB=new Mongo(address, options)
				
	}
}
