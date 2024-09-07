package com.sritech.collections;

import java.util.HashMap;

public class NonGenericHashMap {
	
	public static void main(String[] args) {
		
		HashMap hmap=new HashMap();
		
		hmap.put(1, null);
		
		hmap.put("Python",2);
		
		hmap.put(50.0, "Oracle");
		
		hmap.put(new Clone(), "Java");
		
		System.out.println(hmap);
		
	}

}
