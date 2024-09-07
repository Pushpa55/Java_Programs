package com.sritech.collections;

import java.util.HashMap;

public class HashMapReplace {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap=new HashMap<Integer,String>();
		
		hashMap.put(1, "kotcherla");
		hashMap.put(2, "naga");
		hashMap.put(3, "pushpa");
		hashMap.put(4, "latha");
		
		System.out.println(hashMap);
		
		if(hashMap.containsKey(4))
		{
			if(hashMap.replace(4, "latha", "Arjun"))
			{
				System.out.println("Successfully replaced");
			}
			else
			{
				System.out.println("failed to replace");
			}
		}
		System.out.println(hashMap);
	}

}
