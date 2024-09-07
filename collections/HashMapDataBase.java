package com.sritech.collections;

import java.util.HashMap;

public class HashMapDataBase {
	
	public static void main(String[] args) {
		
		HashMap<String, String> dataBaseProperties=new HashMap<String,String>();
		
	      dataBaseProperties.put("user", "demo");

	      dataBaseProperties.put("path", "/home/demo");

	      dataBaseProperties.put("host", "160.10.20.3");

	      dataBaseProperties.put("dbname", "student");

	      dataBaseProperties.put("uid", "root");

	      dataBaseProperties.put("pwd", "admin123");


		
		System.out.println(dataBaseProperties);
		
		String uidValue=dataBaseProperties.get("uid");
		String pwdValue=dataBaseProperties.get("pwd");
		String pathValue=dataBaseProperties.get("path");
		String userValue=dataBaseProperties.get("user");
		
		System.out.println(uidValue);
		System.out.println(pwdValue);
		System.out.println(pathValue);
		System.out.println(userValue);
		
		System.out.println(dataBaseProperties.toString());
		
	}

}
