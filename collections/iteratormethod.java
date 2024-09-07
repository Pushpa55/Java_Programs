package com.sritech.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratormethod {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Kotcherla");
		list.add("Naga");
		list.add("Pushpa");
		list.add("Latha");
		
		System.out.println(list);
		
		System.out.println("By using for loop");
		
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i);
			System.out.println(str);
		}
		
		System.out.println("By using for each loop");
		
		for(String str : list)
		{
			System.out.println(str);
		}
		
		System.out.println("By using iterator");
		
		Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext())
		{
			String str=iterator.next();
			System.out.println(str);
		}
		
	}
}
