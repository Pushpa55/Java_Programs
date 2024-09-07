package com.sritech.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEntrySet {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hashMap=new HashMap<String,String>();
		
		hashMap.put("k", "kotcherla");
		hashMap.put("n", "naga");
		hashMap.put("p", "pushpa");
		hashMap.put("l", "latha");
		
		System.out.println(hashMap);
		
		Set<Entry<String,String>> entrySet=hashMap.entrySet();
		
		Iterator<Entry<String,String>> iterator=entrySet.iterator();
		
		while(iterator.hasNext())
		{
			Entry<String,String> entry=iterator.next();
			
		   String key=entry.getKey();
		   String value=entry.getValue();
		  // System.out.println(entry);
		   System.out.println(key+"\t"+value);
		}
		
		
		
		
		
	}

}
