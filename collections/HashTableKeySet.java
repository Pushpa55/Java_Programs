package com.sritech.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableKeySet {
	
	public static void main(String[] args) {
		
		Hashtable<String, String> hashtable=new Hashtable<String,String>();
		
		hashtable.put("k", "kotcherla");
		hashtable.put("n", "naga");
		hashtable.put("p", "pushpa");
		hashtable.put("l", "latha");
		
		System.out.println(hashtable);
		
		Set<String> keySet=hashtable.keySet();
		
		Iterator<String> iterator=keySet.iterator();
		
		while(iterator.hasNext())
		{
			String key=iterator.next();
			
			String value=hashtable.get(key);
			
			System.out.println(key+"\t"+value);
		}
		
	}

}
