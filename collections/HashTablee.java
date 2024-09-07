package com.sritech.collections;

import java.util.Hashtable;

public class HashTablee {
	
	public static void main(String[] args) {
		
		Hashtable<String, String> hashTable=new Hashtable<String,String>();
		
		hashTable.put("k", "kotcherla");
		hashTable.put("p", "pushpa");         // don't Maintain insertion order
		hashTable.put("l", "latha");          // duplicate key don't allowed
		hashTable.put("j", null);             // but duplicate values allowed
		hashTable.put(null, "naga");          // key and values don't accept null values 
		
		System.out.println(hashTable);
	}

}
