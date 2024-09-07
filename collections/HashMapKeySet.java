package com.sritech.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapKeySet {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hashMap=new HashMap<String,String>();
		
		hashMap.put("k", "kotcherla");
		hashMap.put("n", "naga");
		hashMap.put("p", "pushpa");
		hashMap.put("l", "latha");
		
		System.out.println(hashMap);
		
		Set<String> keySet=hashMap.keySet();
		
		Iterator<String> iterator=keySet.iterator();
		
		while(iterator.hasNext())
		{
			String key=iterator.next();
			
			String value=hashMap.get(key);
			
			System.out.println(key+"\t"+value);
		}
	}

}
