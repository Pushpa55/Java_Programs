package com.sritech.collections;

import java.util.ArrayList;

public class StaticArrayToDynamicArray {
	
	public static void main(String[] args) {
		
		String [] names={"Kotcherla","Naga","Pushpa","Latha"};
		
		ArrayList<String> list=new ArrayList<String>();
		
		for(String name : names)
		{
			list.add(name);
		}
		System.out.println(list);
	}

}
