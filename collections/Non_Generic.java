package com.sritech.collections;

import java.util.ArrayList;

public class Non_Generic {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		System.out.println("Before adding:"+list.size());
		
		list.add(50);
		
		list.add("PUSHPA");
		
		list.add(new Employee());
		
		list.add(new Student());
		
		list.add(new Product());
		
		list.add(new Item());
		
		list.add(10.50);
		
		System.out.println(list);
		
		System.out.println("After adding:"+list.size());
		
	}

}
