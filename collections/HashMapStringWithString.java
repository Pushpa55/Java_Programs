package com.sritech.collections;

import java.util.HashMap;

public class HashMapStringWithString {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hMap=new HashMap<String,String>();
		
		hMap.put("p", "pushpa");    // don't Maintain insertion order
		hMap.put("l", "latha"); 
		hMap.put("f", "latha");      // key should be unique
		hMap.put("n", "naga");       // value don't unique
		hMap.put("k","kotcherla");
		
		System.out.println(hMap);
		
		
	}

}
