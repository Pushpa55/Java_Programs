package com.sritech.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapp {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, String> linkedHashMap=new LinkedHashMap<String,String>();
		
		linkedHashMap.put("P", "Pushpa");
		linkedHashMap.put("l", "latha");    // it's maintain insertion order
		linkedHashMap.put("f", "latha");   // key should be unique
		linkedHashMap.put("n", "naga");    // value don't unique
		linkedHashMap.put("n", "kkk");
		linkedHashMap.put("k", "kotcherla");
		
		System.out.println(linkedHashMap);
	}

}
